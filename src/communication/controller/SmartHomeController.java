package communication.controller;

import model.LightControl;

// De clientcode die momenteel alleen lampen ondersteunt

public class SmartHomeController {
    private LightControl device;

    public SmartHomeController(LightControl device) {
        this.device = device;
    }

    public void activateDevice() {
        device.turnOn();
    }

    public void deactivateDevice() {
        device.turnOff();
    }

    public void adjustDevice(int level) {
        device.dim(level);
    }
}