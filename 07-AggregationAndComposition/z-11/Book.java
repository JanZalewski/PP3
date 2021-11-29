import java.util.ArrayList;


public class Book
{
    private String title;
    private Writer author;
    private int pages;
    private ArrayList<String> chapters = new ArrayList<String>();
    
    Book(String title, Writer author, int pages){
        this.title = title;
        this.author = author;
        this.pages= pages;
    };
    
    public void open(){
    };
    public void read(){
    };

    public void addChapter(Chapter ch1){
        chapters.add(ch1.toString());
    };
    public String toString(){
        return "Title: " + title+ "\n" + "Author: " + author.toString() + "\nNumber of Pages: " + pages + "\nChapters: " + chapters;  
    };
    
    public static void main(){
        Writer w1 = new Writer("Adam", "Mickiewicz", 55);
        Chapter ch1 = new Chapter("Rozdzial III", 45, 98);
        Book b1 = new Book("Dziady" , w1, 240);
        b1.addChapter(ch1);
        System.out.println(b1);
        
        
    };
}
