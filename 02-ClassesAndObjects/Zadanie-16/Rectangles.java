
/**
 16. Define a class for describing rectangles.
 Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively.
 Display their dimensions, perimeters and surface areas 
*/
public class Rectangles
{
    int length1;
    int length2;
    
    void showDimensions() {
        System.out.println("Dimensions: " + length1 + "x" + length2);
    };
    void showPerimeter() {
        System.out.println("Perimeter: " + ((2*length1)+(2*length2)));
    };
    void showSurface() {
        System.out.println("Surface: " + length1*length2);
    };
}
