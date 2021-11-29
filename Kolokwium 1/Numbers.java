

public class Numbers
{
    static int max(int n1, int n2, int n3){
         int big = n1;
         if (n2 > big){
             big = n2;
         };
         if (n3 > big){
             big = n3;
         };
         return big;
    };
}
