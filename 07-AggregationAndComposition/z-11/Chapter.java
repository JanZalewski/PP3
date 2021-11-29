
public class Chapter
{
    private String title;
    private int numOfPages;
    private int startingPage;
    
    Chapter(String title, int numOfPages, int startingPage){
        this.title = title;
        this.numOfPages = numOfPages;
        this.startingPage = startingPage;
    };
    
    public String toString(){
      return "Chapters title: " + title + "\nNumber of Pages: " + numOfPages + " Starting Page: " + startingPage;  
    };
}
