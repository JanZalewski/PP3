
/**
 15. Create a library of methods for the calculation of basic statistics:
a. Number of items within the specified range <x,y>
b. Sum of numbers in the given range <x,y>
c. Arithmetic mean of the numbers in the given range <x,y>

Then create a program that calculates and displays the basic statistics 
for integers in the range <5,10>
 */
public class calculations
{
    int range1;
    int range2;
    int numOfItems;
    int sum;
    float mean;
    
    void calcNumOfItems(){
        numOfItems = range2-range1+1;
    };
    void sumOfNum(){
        for (int i=range1; i<=range2; i++) {
            sum += i;
        };
    };
    void mean(){
        float num = range2-range1+1;
        mean = sum/num;
    };
    
    void display(){
      System.out.println("Number of items within the specified range: " + numOfItems);
      System.out.println("Sum of numbers in the given range: " + sum);
      System.out.println("Arithmetic mean of the numbers in the given range: " + mean);
    };
}
