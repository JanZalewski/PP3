

public class Counter
{
    int count = 0;
    
    void increase(){
        count += 1;
    };
    void decrease(){
        count -= 1;
    };
    void increase(int n){
        count += n;
    };
    void decrease(int n){
        count -= n;
    };
    
    int value(){
        return count;
    };
}
