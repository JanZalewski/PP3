
/**
 21. Add an alarm function to the clock. 
 Complete the class definition with the attributes: alarmHour, alarmMinute. 
 Add methods: setAlarm(hour, minute) and runAlarm(), which displays the "beep-beep-beep-beep !!" alarm sound.
 Turn on the alarm when the alarm time is the same as the clock time(compare times in the addOneMinute() method).
 */
public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock(){
        this.hour = 0;
        this.minute = 0;
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
        this.hour = 0;
        this.minute = 0;
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
            minute = 0;
            hour =0;
            
        } else{
            hour+=1;
            minute=0;
        };
        if (hour==alarmHour && minute==alarmMinute){
            System.out.println("beep-beep-beep-beep !!");
        };
    };
    void setAlarm(int hour, int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
    };
    void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    };
}