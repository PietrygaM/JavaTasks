/*
1. Stwórz 10 elementową tablicę wypełnioną pojedynczą wartością 2. 
Tablica powinna wyglądać następująco:
    ````
    [2. 2. 2. 2. 2. 2 .2. 2. 2. 2]
    ````
2. Zadanie wykonaj bez użycia pętli for.

*/



import java.util.Arrays;

public class Task013 {

    public static void main(String[] args) {
        
    int[] tab = new int[10];
    Arrays.fill(tab, 2);
    System.out.println(Arrays.toString(tab));	
    }  
    
}
