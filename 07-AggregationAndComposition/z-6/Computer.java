

public class Computer
{
   private String diskType;
   private int rom;
   private int ram;
   private Processor processor;
   
   Computer(String diskType, int rom, int ram, Processor processor){
       this.diskType = diskType;
       this.rom = rom;
       this.ram = ram;
       this.processor = processor;
   };
   
   public void turnOff(){};
   public void turnOn(){};
   
   public String toString(){
       return "Disk Type: " +  diskType + "\nrom: " + rom + "\nram: " + ram + "\n Processor: " + processor;
   };

}
