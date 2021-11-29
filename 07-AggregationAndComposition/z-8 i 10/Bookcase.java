import java.util.ArrayList;


public class Bookcase
{
  private String color;
  private int height;
  private ArrayList<String> shelf = new ArrayList<String>();
  
  Bookcase(String color, int height){
      this.color= color;
      this.height = height;
  };
  
  public void addBook(Book b){
      shelf.add(b.toString());
  }
  public void removeBook(Book b){
      shelf.remove(b.toString());
  };
  
  public String toString(){
      return "Bookcase color and height: " + color + " " + height + "\n" + shelf;
  };
  
  public static void main(){
      Writer w1 = new Writer("Adam", "Mickiewicz", 55);  
      Book b1 = new Book("Dziady" , w1, 240);
      Writer w2 = new Writer("Bolesław", "Prus", 60);  
      Book b2 = new Book("Lalka" , w2, 432);
      Bookcase c1 = new Bookcase("Brown", 230);
      c1.addBook(b1);
      c1.addBook(b2);
      System.out.println(c1);
  };
}
