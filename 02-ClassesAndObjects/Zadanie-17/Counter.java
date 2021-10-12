
/**
 17. Design a simple counter. The initial value of the counter is 0.
 The counter can be increased or decreased by one, and increased and decreased by 10.
 It is possible to reset the counter to its initial value.
 Then define a class for counters. Create two counters. Set the first counter to 23 and the second one to -47.
 */
public class Counter
{
    int initialValue= 0;
    
    void increaseBy1() {
        initialValue += 1;
    };
    void decreaseBy1() {
        initialValue -= 1;
    };
    void increaseBy10() {
        initialValue += 10;
    };
    void decreaseBy10() {
        initialValue -= 10;
    };
    void resetValue() {
        initialValue = 0;
    };
}
