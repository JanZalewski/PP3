
/**
 20. Define a class Clock that represents a digital clock. It has two attributes: hour and minute.
 The hour value ranges from 0 to 23.
 The minute value ranges from 0 to 59. Next, define the following constructors:

a. Clock() – initialises clock to 00:00
b. Clock(hour,minute) – initialises clock to hour:minute

Then, define methods:

c. setClock(hour,minute)
d. setClock() - reset clock to 00:00
e. displayTime()
f. addOneMinute()
 */
public class Clock
{
    int hour;
    int minute;
    
    Clock(){
        this.hour = 00;
        this.minute = 00;
    };
    Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    };
    
    void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    };
    void setClock(){
        this.hour = 00;
        this.minute = 00;
    };
    void displayTime(){
        if (hour<10 && minute<10){
            System.out.println("Time: 0" + hour+":0"+minute);
        } else if (hour<10){
            System.out.println("Time: 0" + hour+":"+minute);
        } else if (minute<10){
            System.out.println("Time: " + hour+":0"+minute);
        } else{
            System.out.println("Time: " + hour+":"+minute);
        };
            
        
    };
    void addOneMinute(){
        if (minute <=58) {
            minute += 1;
        } else if (hour == 23 && minute == 59) {
            minute = 00;
            hour =00;
            
        } else{
            hour+=1;
            minute=00;
        };
    };
}
