

public class File
{
    private String name;
    private int size;
    private String type;
    
    File(String name, int size, String type){
        this.name= name;
        this.size = size;
        this.type = type;
    };
    
    public void open(){};
    
    public void close(){};
    
    public String toString(){
        return "Name: " + name + "\nSize: " + size + "\nType: " + type;
    };
}
