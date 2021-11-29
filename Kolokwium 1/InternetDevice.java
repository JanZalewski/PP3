
public class InternetDevice
{
    private String name;
    private boolean connected;
    static int connectedDevices;
    
    InternetDevice(String name){
        this.name = name;
    };
    
    public void setName(String name){
        this.name = name;
    };
    public void setConnected(boolean connected){
        if (this. connected == false && connected == true){
            this.connectedDevices += 1;
        } else if (this.connected == true && connected == false && connectedDevices > 0){
            this.connectedDevices -= 1;
        };
        this.connected = connected;
    };
    public String getName(){
        return name;
    };
    public boolean getConnected(){
        return connected;
    };
    void connect(){
        if (connected == false){
            connected = true;
            connectedDevices += 1;
        };
    };
    void disconnect(){
        if ( connected == true && connectedDevices > 0){
            connectedDevices -= 1;
        };
        connected = false;
    };
    
    boolean isConnected(){
        return getConnected();
    };
    
    int connections(){
        return connectedDevices;
    };
}
