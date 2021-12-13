import java.util.ArrayList;


public class Library
{
    private ArrayList<Book> books = new ArrayList<Book>();
    
    
    
    public static void main(){
        Book b1 = new Book("Hobbit", "Tolkien");
        Book b2 = new Ebook("Harry Potter", "Rowling", "harpot.pdf");
        Book b3 = new Ebook("Dziady cz.3", "Mickiewicz", "dzIV.pdf");
        Book b4 = new Audiobook("Pan Tadeusz", "Mickiewicz", 360, 21600);
        Book b5 = new Audiobook("Lalka", "Prus", 300, 18000);
        
        Library l1 = new Library();
        l1.books.add(b1);
        l1.books.add(b2);
        l1.books.add(b3);
        l1.books.add(b4);
        l1.books.add(b5);
        for (Book i : l1.books){
            i.display();
        };
        
    };
}
