
/**
 * Write a description of class MobilePhone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MobilePhone
{
    private String model;
    private String brand;
    private String number;
    private int yearOfProduction;
    private boolean isOn;
    private int memory;
    
    public void call(){
        
    };
    public void turnOff(){
        this.isOn = false;
    };
    public void turnOn(){
        this.isOn = true;
    };
}
