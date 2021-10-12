
/**
 15. Define a class for describing lamps. Then define the following object attributes and behaviors:
a. attributes: whether a lamp is on
b. behaviors: (1) switch on the lamp, (2) switch off the lamp, (3) display information whether the lamp is on or off
After that, create two lamps, switch on the first one and switch off the second one. Display information whether the lamps are on or off
 */
public class Lamps
{
    String lampStatus;
    
    void switchOn() {
        lampStatus = "ON";
    };
    
    void switchOff() {
        lampStatus = "OFF";
    };
    
    void displayStatus() {
        System.out.println("Lamp is " + lampStatus);
    };
}
