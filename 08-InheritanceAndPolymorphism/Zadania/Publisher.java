
public class Publisher
{
    private String name;
    private String city;
    
    Publisher(String name, String city){
        this.name = name;
        this.city = city;
    };
    
    public void setName(String name){
        this.name = name;
    };
    public String getName(){
        return name;
    };
    public void setCity(String city){
        this.name = name;
    };
    public String getCity(){
        return city;
    };
    public String toString(){
        return "Name: " + name + "City: " + city;
    };
}
