
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
   private String title;
   private String category;
   private String author;
   private String releaseDate;
   private int numberOfPages;
   
   public String displayData(){
       return title + " " + category + " " + author + " " + releaseDate + " " + numberOfPages;
   };
}
