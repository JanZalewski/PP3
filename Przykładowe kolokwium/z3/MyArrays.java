
/**
 Xpkt)Zdefiniuj klasę MyArrays, zawierającą dwie metody statyczne:
 metodę max(int[] array)zwracającą największą wartość w przekazanej tablicy
 oraz metodę odd(int[] array) zwracającą ilość liczb nieparzystych w przekazanej tablicy.
 */
public class MyArrays
{
 static void max(int[] array){
     int max = array[0];
     for (int i  : array){
         if (i > max) {
             max = i;
         };
     };
     System.out.println("MAX: " + max);
 };
 static void odd(int[] array){
     int count = 0;
     for (int i  : array){
         if (i % 2 == 1){
             count += 1;
         };
     };
     System.out.println("Number of odds: " + count);
 };
}
