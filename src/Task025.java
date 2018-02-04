/*
W pliku umieść metodę o sygnaturze `static int[] append(int[] arr)`. 
 
1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy 
jej zawartość została skopiowana do tymczasowej tablicy,
 której rozmiar ma być 2-krotnie większy od tablicy podanej.
2. Uzupełnij brakujące elementy tymczasowej tablicy elementami 
tablicy pierwotnej w odwrotnej kolejności.
3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona 
tablica int arrTmp[] = {1,2,3,3,2,1};

*/

import java.util.Arrays;

public class Task025 {

	public static void main(String[] args) {

		int[] testTab = { 2, 3, 4, 5, 4, 100 };

		int[] tab = append(testTab);
		toDisplay(tab);

	}

	static int[] append(int[] arr) {
		int[] tmpArray = Arrays.copyOf(arr, arr.length * 2);
		int j = arr.length - 1;
		for (int i = tmpArray.length / 2; i < tmpArray.length; i++) {
			tmpArray[i] = arr[j];
			j--;
		}
		return tmpArray;
	}

	static void toDisplay(int[] tab) {
		for (int el : tab) {
			System.out.print(el + ", ");
		}

	}
}
