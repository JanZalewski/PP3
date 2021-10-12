
/**
 14. Define a class for describing books.
 Then, define fields and methods in the class that represent the attributes and behaviors of the book objects.
 Finally, create two books, assign them attribute values, and call defined methods.
 */
public class Books
{
  String title;
  String author;
  int numberOfPages;
  String publicationDate;
  boolean isBookNew;
  
  void showInfo() {
      System.out.println(title + " " + author);
    };
  void checkStatus() {
      System.out.println("New book: " + isBookNew);
  };
}
