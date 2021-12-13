

public class Book
{
    // instance variables - replace the example below with your own
    private String title;
    protected Writer author;
    protected Publisher publisher;
    private int yearOfPub;
    
    
    
    Book(String title, Writer author, Publisher publisher, int year){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        yearOfPub = year;
    };
    
    public void setTitle(String title){
        this.title = title;
    };
    public void setAuthor(Writer author){
        this.author = author;
    };
    public String getTitle(){
        return title;
    };
    public String getAuthor(){
        return author.toString();
    };
    public void setYearOfPub(int year){
        yearOfPub = year;
    };
    public int getYearOfPub(){
        return yearOfPub;
    };
    
    public void display(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Title: " + title + "\nAuthor: " + author.toString() + "\nPublisher: "+ publisher.toString());
        System.out.println("Year of publication: " + yearOfPub);
    };
    
    public static void main(){
        Publisher p1 = new Publisher("Kowal","Warszawa");
        Publisher p2 = new Publisher("Marko","Szczecin");
        Writer w1 = new Writer("John","Tolkien", "powiesc");
        Writer w2 = new Writer("J.K.","Rowling", "powiesc");
        
        Book b1 = new Book("Hobbit", w1,p1, 2012);
        Book b2 = new Book("Harry Potter", w2, p2, 2008);
        b1.display();
        b2.display();

    };
    
}
