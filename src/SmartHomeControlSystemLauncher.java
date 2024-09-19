import communication.controller.SmartHomeController;
import model.LightControl;
import model.SmartLight;

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

    }
}
