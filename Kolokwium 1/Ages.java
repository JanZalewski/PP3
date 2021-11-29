
public class Ages
{
    static int min(int[] ages){
        int youngest = ages[0]; 
        for ( int i : ages){
            if (i < youngest){
                youngest = i;
            };
        };
        return youngest;
    };
}
