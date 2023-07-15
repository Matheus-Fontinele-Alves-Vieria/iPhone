package entities;

import core.Device;
import entities.interfaces.MusicPlayer;
import entities.interfaces.Phone;
import entities.interfaces.Browser;

public class IPhone extends Device implements MusicPlayer, Phone, Browser {

    public IPhone(String name, String model) {
        super(name, model);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pusada");
    }

    @Override
    public void playMusic(String music) {
        System.out.println("Música tocando: " + music);
    }

    @Override
    public void selectMusic() {
        String [] musics = {
                            "Imaginarium - Vegas(Brazil), Aura Vortex",
                            "Barbie Girl - Aqua",
                            "Whatever It Takes - Imagine Dragons",
                            "Dream On - Aerosmith",
                           };
        String option;

        System.out.println("Selecione uma música:");
        for(int i = 0; i < musics.length; i++) {
            System.out.println(i+1 + ": " + musics[i]);
        }

        System.out.print("Diga a sua música selecionada: ");
        option = System.console().readLine();

        if(option.equals("1")) {
            playMusic("Imaginarium - Vegas(Brazil), Aura Vortex");
        } 
        else if(option.equals("2")) {
            playMusic("Barbie Girl - Aqua");
        }
        else if(option.equals("3")) {
            playMusic("Whatever It Takes - Imagine Dragons");
        }
        else if(option.equals("4")) {
            playMusic("Dream On - Aerosmith");
        }
    }

    @Override
    public void answerCall() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void call() {
        System.out.println("Chamando");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Gravando correio de voz");
    }

    @Override
    public void addTab() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void displayPage() {
        System.out.println("Página aberta");
    }

    @Override
    public void refreshPage() {
        System.out.println("Página atualizada");
    }
}
