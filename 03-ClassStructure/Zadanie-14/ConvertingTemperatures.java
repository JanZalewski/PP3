
/**
 14. Create a library of methods for converting temperatures between
 Celsius, Kelvin, and Fahrenheit. You can name the methods
 e.g. CelsiusToKelvin(), KelvinToCelsius(), ect.
 Then create a program that calculates and displays the temperature:

a. 25 degrees Celsius in Kelvin and Fahrenheit

b. 100 degrees Fahrenheit in Kelvin and Celsius

c. 0 degrees Kelvin in Celsius and Fahrenheit
 */
public class ConvertingTemperatures
{
    String tempType;
    float temp;
    
    void celsiusToKelvin() {
        tempType = "Kelvin";
        temp = temp + 273.15f;
    };
    
    void kelvinToCelsius(){
        tempType = "Celsius";
        temp = temp-273.15f;
    };
    
    void celsiusToFahrenheit(){
        tempType = "Fahrenheit";
        temp = temp*9/5+32;
    };
    
    void kelvinToFahrenheit(){
        tempType = "Fahrenheit";
        temp = temp*1.8f-459.67f;
    };
    
    void fahrenheitToCelsius(){
        tempType = "Celsius";
        temp = (temp-32)/1.8f;
    };
    
    void fahrenheitToKelvin(){
        tempType = "Kelvin";
        temp = (temp+459.67f)*(5/9.0f);
    };
    
    void displayTemp(){
        System.out.println("Temperature: " + temp + " " + tempType);
    };
    
}
