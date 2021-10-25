
/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    static String cinemaName = "multikino";
    
    String filmTitle;
    int row;
    int seat;
    float price;
    
    CinemaTicket(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if (row <=2) {
            this.price = 10.0f;
        }
        else {
            this.price = 25.0f;
        };
    };
    
    void displayInfo() {
        System.out.println(cinemaName);
        System.out.println(filmTitle);
        System.out.println("Miejsce: " + row + " " + seat);
        System.out.println(price);
    };
    
    
    
    public static void main(String[] arg) {
      CinemaTicket ticket1 = new CinemaTicket("Gladiator", 2, 7);
      ticket1.displayInfo();
      CinemaTicket ticket2 = new CinemaTicket("Gladiator", 5, 7);
      ticket2.displayInfo();
      
      
    };
        
}
