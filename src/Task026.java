/*
W pliku umieść metodę o sygnaturze `static int evenSum(int[][] arr)`.
 
1. Uzupełnij ciało metody tak, aby zliczyła sumę wartości dla wszystkich elementów 
z nieparzystych indeksów.
2. Metoda ma zwrócić sumę.
Przykład: dla tablicy int arr[][] = {{1,2,3},{4,5,6}}; int sum = 2 + 5;

*/

public class Task026 {

	public static void main(String[] args) {

		int[][] testTab = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
		int sum=evenSum(testTab);
		displaySum(sum);
	}

	static int evenSum(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j += 2) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	static void displaySum(int sum) {
				System.out.println("Suma wynosi "+sum);
		}
      
  }
