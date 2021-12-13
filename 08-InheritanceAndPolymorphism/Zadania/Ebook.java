

public class Ebook extends Book
{
    private String fileName;
    
    Ebook(String title, Writer author, Publisher p, int year, String fileName){
        super(title, author, p, year);
        this.fileName = fileName;
    };
    
    public void setFileName(String fileName){
        this.fileName = fileName;
    };
    public String getFileName(){
        return fileName;
    };
    
    public void display(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nFile Name: " + fileName);
    };
    
    public static void main(){
        Book b1 = new Book("Hobbit", "Tolkien");
        b1.display();
        Ebook e1 = new Ebook("Harry Potter", "Rowling", "harpot.pdf");
        Ebook e2 = new Ebook("Dziady cz.3", "Mickiewicz", "dzIV.pdf");
        e1.display();
        e2.display();

        
    };
}
