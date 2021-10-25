
/**
 19. Add the constructor StudentGrades(String name)
 that allows you to enter student’s grades from the keyboard.
 Tip: use the Scanner class. See the manual for more information.
 */

import java.util.Random;
import java.util.Scanner;
public class StudentGrades {
    

    
    String studentName;
    double[] grades;
    double lowest;
    double highest;
    int numberOfGrades;
    double mean;
    
    static Random rand = new Random();
    static Scanner myObj = new Scanner(System.in);
    
    StudentGrades(String name, double[] grades){ 
        this.studentName = name;
        this.grades = grades; 
    };
    
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.numberOfGrades = numberOfGrades;
        this.grades = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
         grades[i] = 1 + rand.nextFloat() * (6 - 1);
        };
    };
    
    StudentGrades(String name){
        this.studentName = name;
        System.out.println("Please, write the number of grades :)");
        this.numberOfGrades = myObj.nextInt();
        this.grades = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter grade");
            double num = myObj.nextDouble();
            grades[i] = num;
        };
    };
    
    void lowestGrade(){
        lowest = grades[0];
        for (double i : grades){
            if (i < lowest){
                lowest = i;
            };
        };
    }
    
    void highestGrade(){
        highest = 0;
        for (double i : grades){
            if (i > highest){
                highest = i;
            };
        };
    };
    
    void numOfGrades(){
        numberOfGrades = grades.length;  
    };
    
    void average(){
        double sum = 0;
        for (double i : grades){
            sum += i;
        };
        mean = sum/grades.length;
    };
    
    void display(){
        System.out.println("Name: "+studentName);
        System.out.print("List of Grades: ");
        for (double i : grades){
            System.out.print(i + " ");
        };
        System.out.println("Number of Grades: " + numberOfGrades);
        System.out.println("Lowest grade: "+lowest+ " Highest Grade: " + highest);
        System.out.println("Grade point average: "+mean);
    };
;
}
