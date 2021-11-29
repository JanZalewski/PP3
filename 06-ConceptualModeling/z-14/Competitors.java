

public class Competitors
{
    private int[] scores;
    private String name;
    
    Competitors(int[] scores, String name){
        this.scores = scores;
        this.name = name;
    };
    
    public String showFinalScore(){
        float sum = 0;
        int min = scores[0];
        int max = scores[0];
        for (int i : scores){
            if (i > max){
                max = i;
            };
            if (i < min){
                min = i;
            };
        };
        for (int i : scores){
            sum += i;
        };
        sum -= max;
        sum -= min; 
        return "Competitor's name: " + name + " Score: " + (sum/3);
    };
    
    public static void main(){
        int[] x = {3,4,2,4,3};
        int[] y = {5,5,3,2,1};
        int[] z = {1,5,4,3,5};
        Competitors a = new Competitors(x,"Lewis");
        Competitors b = new Competitors(y,"Max");
        Competitors c = new Competitors(z,"Daniel");
        System.out.println(a.showFinalScore());
        System.out.println(b.showFinalScore());
        System.out.println(c.showFinalScore());
    };
}
