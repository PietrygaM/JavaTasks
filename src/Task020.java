/*
1. Wypisz na konsoli ślad macierzy (sumę elementów na głównej przekątnej).
*/

public class Task020 {

	public static void main(String[] args) {

		int[][] task4Array = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4 }, { 5, 1, 6, 7 } };
		int sum = 0;

		for (int i = 0; i < task4Array.length; i++) {
			for (int j = i; j < task4Array[i].length; j++)
				if (i == j) {
					sum += task4Array[i][j];
				} else {
					break; 
				}
		}
		System.out.println("Suma elementów tablicy wynosi " + sum);
	}
}
