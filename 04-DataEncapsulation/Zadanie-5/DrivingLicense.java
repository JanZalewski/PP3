
/**
 * Write a description of class DrivingLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrivingLicense
{
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String number;
    private int yearOfIssue;
    private String category;
    
    DrivingLicense(String name, String surname, String address, String postalCode, String city, String number, int yearOfIssue, String category){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postalCode = postalCode;
        this.city= city;
        this.number = number;
        this.yearOfIssue = yearOfIssue;
        this.category = category;
    };
    
    void displayData(){
        System.out.println("Driver's name: " + name + " " + surname);
        System.out.println("Driver's address: " + city + " " + postalCode + " " +address);
        System.out.println("Number of license: " +number);
        System.out.println("Year of issue and category: " +yearOfIssue + " " +category);
    };
}
