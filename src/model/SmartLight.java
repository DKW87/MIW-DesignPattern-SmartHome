package model;

public class SmartLight implements LightControl {
    @Override
    public void turnOn() {
        System.out.println("Licht is aangezet");
    }

    @Override
    public void turnOff() {
        System.out.println("Licht is uitgezet");
    }

    @Override
    public void dim(int level) {
        System.out.println("Helderheid van het licht is op " + level + "% gezet");
    }
}