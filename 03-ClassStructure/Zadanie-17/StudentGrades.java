
/**
 17. The following definition of the StudentGrades 
 class allows the storage of a student's grades.
public class StudentGrades
{ String studentName; double[] grades; StudentGrades(String name, double[] grades) { this.studentName = name; this.grades = grades; } }
Complete the class with methods that:

a. calculates of the lowest grade
b. calculates of the highest grade
c. calculates of the number of grades
d. calculates of the grade point average
e. displays student’s record with student’s name, a list of the student's grades, number of grades, lowest grade, highest grade, and grade point average

Then, write a program that creates grades for two students:

f. Amanda: 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5
g. James: 2.0, 3.0, 2.0, 4.5, 4.5
Tip: pass student's grades to the constructor, as an array, in curly brackets, e.g. StudentGrades({5.0, 3.5}).
 */
public class StudentGrades
{
    String studentName;
    double[] grades;
    double lowest;
    double highest;
    int numberOfGrades;
    double mean;
    
    StudentGrades(String name, double[] grades){ 
        this.studentName = name;
        this.grades = grades; 
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