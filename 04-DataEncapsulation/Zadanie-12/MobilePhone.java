
/**
 Choose any object.
 Then define a class that describes such objects. 
 Hide data about an object using data encapsulation.
 */
public class MobilePhone
{
   private String name;
   private String model;
   private String yearOfProduction;
   private int memoryInGb;
   
   public void setName(String name){
       this.name = name;
   };
   public void setModel(String model){
       this.model = model;
   };
   public void setYearOfProduction(String year){
       this.yearOfProduction = year;
   };
   public void setMemoryInGb(int memory){
       this.memoryInGb = memory;
   };
   public String getName(){
       return "Phone Brand: " + name;
   };
   public String getModel(){
       return "Model: " + model;
   };
   public String getYearOfProduction(){
       return "Year of Production: " + yearOfProduction;
   }; 
   public String getMemory(){
       return "Memory: " + memoryInGb;
   };
   void displayData(){
       System.out.println(getName());
       System.out.println(getModel());
       System.out.println(getYearOfProduction());
       System.out.println(getMemory());
   };
}