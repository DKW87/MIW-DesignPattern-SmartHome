package model;

/**
 * @author Danny KWANT
 * @project SmartHomeControlSystem_startproject
 * @created 19/09/2024 - 09:48
 */
public class SmartThermostatAdapter implements LightControl {

    private SmartThermostat smartThermostat;

    public SmartThermostatAdapter(SmartThermostat smartThermostat) {
        this.smartThermostat = smartThermostat;
    }

    @Override
    public void turnOn() {
        smartThermostat.turnHeatingOn();
    }

    @Override
    public void turnOff() {
        smartThermostat.turnHeatingOff();
    }

    @Override
    public void dim(int level) {
        int temperature = convertBrightnessToTemperature(level);
        smartThermostat.setTemperature(temperature);
    }

    private int convertBrightnessToTemperature(int level) {
        final int MIN_LEVEL = 0;
        final int MAX_LEVEL = 100;
        int minTemp = 15;
        int maxTemp = 30;

        if (level < MIN_LEVEL) {
            level = MIN_LEVEL;
        }

        if (level > MAX_LEVEL) {
            level = MAX_LEVEL;
        }

        return minTemp + (level * (maxTemp - minTemp) / 100);
    }

}
