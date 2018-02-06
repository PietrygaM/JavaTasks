/*
W pliku stwórz metodę o sygnaturze `static void rowsColumns()`, która:

1. Wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych `rows` i `columns`.
2. Stworzy tablicę o podanej liczbie rzędów i kolumn.
3. Wypełni tablicę kolejnymi liczbami całkowitymi.
4. Obliczy sumę wszystkich elementów oraz wyświetli na konsoli.
5. Obliczy średnią wszystkich elementów oraz wyświetli na konsoli.
6. Wywołaj metodę w metodzie `main`.

*/


import java.util.Scanner;

public class Task062 {

	public static void main(String[] args) {
	
		rowsColumns();

	}


	static void rowsColumns() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter number of cols");
		int columns = scanner.nextInt();
		scanner.close();

		int[][] table = new int[rows][columns];
		int number = 0;
		int sum = 0;
		int counter = 0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = number;
				number++;
				counter++;
				sum += number;
			}
		}

		for (int i = 0; i < table.length; i++) {
			System.out.println();
			for (int j = 0; j < table[i].length; j++)
				System.out.print(table[i][j] + ", ");
		}
		System.out.println();
		System.out.println("Sum = " + sum + " , avg = " + (double) sum / (double) counter);
	}
	
	
}	
	
	
	

		


