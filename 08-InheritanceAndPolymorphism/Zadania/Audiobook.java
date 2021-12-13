

public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    Audiobook(String title, Writer author, Publisher p, int year, int minutes, int seconds){
        super(title,author, p, year);
        this.minutes = minutes;
        this.seconds = seconds;
    };
    
    public void setMinutes(int minutes){
        this.minutes = minutes;
    };
    public void setSeconds(int seconds){
        this.seconds = seconds;
    };
    public int getMinutes(){
        return minutes;
    };
    public int getSeconds(){
        return seconds;
    };
    
    public void display(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nPublisher: "+ this.publisher.getName() + "  " + this.publisher.getCity());
        System.out.println("Year of publication: " + getYearOfPub());
        System.out.println("Duration in minutes: " + minutes + " In Seconds: " + seconds);
        
    };
    
    public static void main(){
        Publisher p1 = new Publisher("Kowal","Warszawa");
        Publisher p2 = new Publisher("Marko","Szczecin");
        Publisher p3 = new Publisher("Darko", "Poznan");
        Writer w1 = new Writer("John","Tolkien", "powiesc");
        Writer w2 = new Writer("J.K.","Rowling", "powiesc");
        Writer w3 = new Writer("Adam", "Mickiewicz", "dramat");
        Book b1 = new Book("Hobbit", w1,p1, 2012);
        b1.display();
        Audiobook a1 = new Audiobook("Harry Potter", w2, p2, 2008, 360, 21600);
        Audiobook a2 = new Audiobook("Dziady cz.3", w3, p3, 1999, 300, 18000);
        a1.display();
        a2.display();
    };
}
