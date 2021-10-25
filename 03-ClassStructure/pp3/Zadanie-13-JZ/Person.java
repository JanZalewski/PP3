
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{   
    String name;
    float weight;
    int height;
    
    
    Person(String name){
        this.name = name;
    };
    Person(String name, float weight, int height){
        this.name = name;
        this.weight = weight;
        this.height= height;
    };
    
    void setWeightAndHeight(float weight, int height) {
        this.weight = weight;
        this.height= height;
    };
    
    float calculateBMI() {
        return (weight/((height/100.0f)*(height/100.0f)));
        
    };
    
    void displayRecord(){
        System.out.println("Name :" + name);
        System.out.println("weight: " + weight);
        System.out.println("height: " + height);
        System.out.println("BMI: " + calculateBMI());
        
    };
}
