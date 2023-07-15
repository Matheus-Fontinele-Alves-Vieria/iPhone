package entrypoint;

import entities.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("iPhone", "XR");

        iPhone.selectMusic();
        iPhone.displayPage();
        iPhone.addTab();
    }
}
