import java.util.ArrayList;

public class Folder
{
    private int size;
    private String name;
    static ArrayList<String> files = new ArrayList<String>();
    
    Folder(int size, String name){
        this.size = size;
        this.name = name;
    };
    public void open(){};
    public void close(){};
    
    public String toString(){
        return "Folder name: " + name + "\nSize: " + size + "\n Files: " + files;
    };
    
    public static void main(){
        File f1 = new File("ZDJ1", 1, ".JPG");
        files.add(f1.toString());
        File f2 = new File("zdj2", 3, ".PNG");
        files.add(f2.toString());
        Folder F1 = new Folder(20, "Zdjęcia");
        System.out.println(F1);
        File f3 = new File("zdj3", 2, ".PNG"); 
        files.add(f3.toString());
        System.out.println(F1);
    }; 
};
