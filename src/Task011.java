/*
1. Stwórz tablicę z elementami od 0 do 50  np. z kolejnymi liczbami całkowitymi, 
zmienną z tablicą nazwij `mainTab`
2. Następnie wypisz na konsoli po kolei elementy tej tablicy w wierszach po 10.
3. Liczby jednocyfrowe przedstaw formie z dodatkowym zerem na początku np.: 03.

```
00, 01, 02, 03, 04, 05, 06, 07, 08, 09,
10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
```

*/


public class Task011 {

	public static void main(String[] args) {

		int[] tab = createTable();
		printTable(tab);
		
	}

	static int[] createTable() {
		int[] tab = new int[50];
		for (int i = 0; i < 50; i++) {
			tab[i] = i;
		}
		return tab;
	}

	static void printTable(int[] tab) {
		int counter = 1;
		for (int i = 0; i < tab.length; i++) {
			int number = tab[i];
			String toDisplay = number + ", ";
			if (number < 10) {
				toDisplay = "0" + toDisplay;
			}
			if (counter ==10) {
				System.out.println(toDisplay);
				counter=1;
			}
			else {
				System.out.print(toDisplay);
				counter++;
			}
			}
			
		}

	}

