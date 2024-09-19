import communication.controller.SmartHomeController;
import model.LightControl;
import model.SmartLight;
import model.SmartThermostat;
import model.SmartThermostatAdapter;

/* De huidige setup werkt alleen (nog) met SmartLight. Schrijf een object adapter
 * waarmee de SmartThermostat aangesproken kan worden door de controller (de client code).
 * Test in de launcher of het werkt :) */
public class SmartHomeControlSystemLauncher {

    public static void main(String[] args) {

        // De client code die een smartlight aanstuurt
        LightControl light = new SmartLight();
        SmartHomeController controller = new SmartHomeController(light);

        controller.activateDevice();
        controller.adjustDevice(50);
        controller.deactivateDevice();

        // jouw code komt hieronder:

        // initialize
        SmartThermostat smartThermostat = new SmartThermostat();
        SmartThermostatAdapter smartThermostatAdapter = new SmartThermostatAdapter(smartThermostat);
        SmartHomeController thermostatController = new SmartHomeController(smartThermostatAdapter);

        // turn on
        thermostatController.activateDevice();

        // accepted input levels
        thermostatController.adjustDevice(0);
        thermostatController.adjustDevice(33);
        thermostatController.adjustDevice(50);
        thermostatController.adjustDevice(66);
        thermostatController.adjustDevice(100);

        // unaccepted input levels
        thermostatController.adjustDevice(-100);
        thermostatController.adjustDevice(200);

        // turn off
        thermostatController.deactivateDevice();


    }
}
