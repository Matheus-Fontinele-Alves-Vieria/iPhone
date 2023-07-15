package core;

public abstract class Device {
    private String name;
    private String model;
    private int batteryLevel;
    private int volume;
    
    public Device(String name, String model) {
        this.name = name;
        this.model = model;
        this.batteryLevel = 100;
        this.volume = 50;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void turnOn() {
        batteryLevel = 100;
    }

    public void turnOff() {
        batteryLevel = 0;
    }

    public void decreaseBatteryLevel(int amount) {
        batteryLevel -= amount;
    }

    public void increaseVolume() {
        volume += 1;

        if(volume > 100) {
            volume = 100;
        }
    }

    public void decreaseVolume() {
        volume -= 1;

        if(volume < 0) {
            volume = 0;
        }
    }
}
