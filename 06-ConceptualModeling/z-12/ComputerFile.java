
/**
 * Write a description of class ComputerFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComputerFile
{
    private String fileType;
    private int size;
    private String localization;
    private String name;
    
    public String displayInfo(){
        return fileType + " " + size + " " + localization + " " + name;
    };
    public void setName(String name){
        this.name = name;
    };
    public String getSize(){
        return "size: " + size;
    };
}
