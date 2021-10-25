
/**
 22. Define a class Room that represents a hotel room.
 The class should contain the attributes: number, beds, occupied, and guestName.
 Add constructors: Room(number) (creates a room with two beds) and Room(number,beds).
 Next, define methods for room manipulation: checkin(guestName), checkout(), isOccupied(), and displayStatus().
 Then write a program in which create three rooms with two beds, two rooms with three beds and one room with one bed.
 Store all room objects in an array:
Room[] rooms = new Room[6];

Then follow the steps below:

a. Display status of a single room (room number, number of beds, occupied, guest name). Display data in a single row.
b. Display a report with a list of rooms (room number, number of beds, occupied, guest name)
c. Display a report with a list of rooms, limited to rooms with the specified number of beds
d. Display a report on how many rooms are vacant and how many are occupied
e. Display a report on how many vacant beds are available
Create a separate static method for each report. Pass a list of rooms (an array) to the defined static methods.
 */
public class Room
{
    int number;
    int beds;
    boolean isOccupied;
    String guestName;
    
    Room(int number){
        this.number = number;
        this.beds = 2;
    };
    
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    };
    
    void checkin(String guestName){
        this.guestName = guestName;
        isOccupied = true;
    };
    void checkout(){
        isOccupied = false;
        guestName = null;
    };
    public String toString(){ 
        return this.number+" "+this.beds+" "+isOccupied+" "+guestName;  
    } 
    void displayStatus(){
        System.out.print("Room number: " + number + " ");
        System.out.print("Number of beds: " + beds + " ");
        System.out.print("Occupied: " + isOccupied + " ");
        System.out.print("Guest Name: " + guestName + " ");
    };
    
    public static void main(String[] args) { 
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1,2);
        rooms[1] = new Room(2,2);
        rooms[2] = new Room(3,2);
        rooms[3] = new Room(4,3);
        rooms[4] = new Room(5,3);
        rooms[5] = new Room(6,1);
        
        allReport(rooms);
        limitedReport(rooms, 2);
        areOccupied(rooms);
        vacPlaces(rooms);
    };
    
    
    static void allReport(Room[] rooms){
        for(int i=0;i < rooms.length ;i++){
            System.out.print("Room number: " + rooms[i].number + " ");
            System.out.print("Number of beds: " + rooms[i].beds + " ");
            System.out.print("Occupied: " + rooms[i].isOccupied + " ");
            System.out.println("Guest Name: " + rooms[i].guestName + " ");
        };
    };
    static void limitedReport(Room[] rooms, int numBeds){
        for(int i=0;i < rooms.length ;i++){
            if (rooms[i].beds == numBeds) {
                System.out.print("Room number: " + rooms[i].number + " ");
                System.out.print("Number of beds: " + rooms[i].beds + " ");
                System.out.print("Occupied: " + rooms[i].isOccupied + " ");
                System.out.println("Guest Name: " + rooms[i].guestName + " ");
            };
        };
    };    
    static void areOccupied(Room[] rooms){
        int vacant = 0;
        int occup = 0;
        for ( Room i : rooms){
            if (i.isOccupied){
                occup += 1;
            }else {
                vacant +=1;
            };
        };
        System.out.println(vacant + " rooms are vacant");
        System.out.println(occup + " rooms are occupied");
    };
    static void vacPlaces(Room[] rooms){
        int vacant = 0;
        for ( Room i : rooms){
            if (i.isOccupied){
                ;
            }else {
                vacant += i.beds;
            };
        };
        System.out.println("There is " +vacant+ " vacant beds available");
    };
        
    
}
