
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
    
    public void  setName(String name){
        this.name = name;
    };
    public void  setSurname(String surnname){
        this.surname = surname;
    };
    public void  setAddress(String address){
        this.address = address;
    };
    public void  setPostalCode(String postalCode){
        this.postalCode = postalCode;
    };
    public void  setCity(String city){
        this.city = city;
    };
    public void  postalCode(String postalCode){
        this.postalCode = postalCode;
    };
    public void  setNumber(String number){
        this.number = number;
    };
    public void  setYearOfIssue(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }; 
    public void  setCategory(String category){
        this.category = category;
    };
    

    public String getName(){
        return name;
    };
    public String getSurname(){
        return surname;
    };
    public String getAddress(){
        return address;
    };
    public String getPostalCode(){
        return postalCode;
    };
    public String getCity(){
        return city;
    };
    public String getNumber(){
        return number;
    };
    public int getYearOfIssue(){
        return yearOfIssue;
    };
    public String getCategory(){
        return category;
    };
    
    public String toString(){
        return getName() + " " + getSurname() + " " +getCity()+" "+getPostalCode()+" "+getAddress()+" "+getNumber()+" "+getYearOfIssue()+" "+getCategory();
    };
        
    
    
    void displayData(){
        System.out.println("Driver's name: " + getName() + " " + getSurname());
        System.out.println("Driver's address: " + getCity() + " " + getPostalCode() + " " +getAddress());
        System.out.println("Number of license: " +getNumber());
        System.out.println("Year of issue and category: " +getYearOfIssue() + " " +getCategory());
    };
    
    public static void main(String[] args){
        DrivingLicense d1 = new DrivingLicense("Adam", "Kowalski", "Skalska", "32-300", "Olkusz", "1331", 2019, "B2");
        d1.displayData();
    }
}
