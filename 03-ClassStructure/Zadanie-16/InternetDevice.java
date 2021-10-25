
/**
 16. There are many devices that can use the Internet: a personal computer, laptop, tablet, smartphone, internet radio or TV.
 Define an InternetDevice class to describe such devices.
 The class should contain attributes: name (device name), 
 connected (whether a device is connected to the Internet), 
 and connectedDevices (the number of connected devices - static field).
 Add a constructor InternetDevice(name) and methods for device manipulation: 
 connect(), disconnect(), isConnected(), displayStatus(), displayConnections() (static method).
 Then write a program that creates five different internet devices, three of which are connected to the Internet.
 Display the status of each device and information about the number of devices connected to the Internet.
 */
public class InternetDevice
{
    static int connectedDevices = 6;
    
    String name;
    boolean isConnected;
    
        InternetDevice(String name) {
            this.name = name;
        };
        
        void connect(){
            isConnected = true;
        };
        void disconnect(){
            isConnected = false;
        };
        void displayStatus(){
            if (isConnected){
                System.out.println("Status: connected");
            }
            else {
                System.out.println("Status: not connected");
            };            
        };
        static void displayConnections(){
            System.out.println("Number of connected devices: " + connectedDevices);
        };

    }