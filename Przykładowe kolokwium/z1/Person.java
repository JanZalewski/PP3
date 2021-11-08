
/**
(Xpkt) Zdefiniuj klasę Person, zawierającą atrybuty opisujące osobę:
 name(String),adult(boolean).Zastosuj hermetyzację danych. 
 Zdefiniuj konstruktor z parametrami: nameorazadult(w tej kolejności), 
 umożliwiający zainicjowanie wartości początkowych atrybutówobiektu.
 Zdefiniuj metody dostępowe i modyfikujące dla każdego z atrybutów. \
Zastosujnazwy metod zgodnie z konwencjąnazw. 
 */
public class Person
{
    private String name;
    private boolean adult;
    
    Person(String name, boolean adult){
        this.name = name;
        this.adult = adult;
    };
    
    public void setName(String name){
        this.name = name;
    };
    public void setAdult(boolean adult){
        this.adult = adult;
    };
    
    public String getName(){
        return "Name: " + name;
    };
    public String getAdult(){
        return "Person is adult: " + adult;
    };
}
