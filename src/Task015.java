/*
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `numbers`.
2. Posortuj rosnąco tablicę wykorzystując metody klasy Arrays.
3. Wyświetl w konsoli posortowaną tablicę - również wykorzystaj metodę klasy Arrays.

*/



import java.util.Arrays;

public class Task015 {

    public static void main(String[] args) {
        
        int[] numbers= {12,46,9,3,5,15,34,78,66,25};  
        
        Arrays.sort(numbers);
        toDisplay(numbers);
        System.out.println(Arrays.toString(numbers));

        }

    
	static void toDisplay(int[] tab) {
		for (int el : tab) {
			System.out.print(el + ", ");
		}
		System.out.println();
	}
}
