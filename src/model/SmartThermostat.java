package model;

// De Adaptee (incompatibele klasse) voor de Thermostaat.

public class SmartThermostat {
    public void setTemperature(int temperature) {
        System.out.println("De thermostaat is op " + temperature + " graden gezet");
    }

    public void turnHeatingOn() {
        System.out.println("De verwarming is aangezet");
    }

    public void turnHeatingOff() {
        System.out.println("De verwarming is uitgezet");
    }
}