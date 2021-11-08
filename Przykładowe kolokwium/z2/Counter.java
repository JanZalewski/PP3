
/**
(Xpkt)Zdefiniuj klasę Counter, która umożliwia utworzenie licznikatypu całkowitego int.
Początkowa wartośćlicznika wynosi 0. 
Klasa zawierametodę increase() zwiększającą wartość licznika o 1 oraz metodę decrease() zmniejszającą wartość licznika o 1.
 Utwórz również metody przeciążone increase(int n) oraz decrease(int n)
 umożliwiające zwiększenie lub zmniejszenie wartości licznika o wartość n.
 Dodaj w klasie metodę value() zwracającą wartość licznika.
 */
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
   void value(){
       System.out.println("Wartość licznika: " + count);
   };
}
