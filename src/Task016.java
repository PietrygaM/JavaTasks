/*
1. Stwórz tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `numbers`.
2. Stwórz drugą tablicę z 10 dowolnymi liczbami, zmienną z tablicą nazwij `secondNumbers`.
3. Stwórz trzecią tablicę zawierającą sumę wszystkich kolejnych elementów. 

Dla przykładowych tablic:
```java
int[] numbers = {2, 3};
int[] secondNumners = {3, 4};
```
wynikiem będzie tablica o elementach `5 i 7` .

*/



import java.util.Arrays;

public class Task016 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] secondNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] sum=sumTable(numbers, secondNumbers);
		System.out.println(Arrays.toString(sum));
	}

	
	static int[] sumTable(int[] tab_one, int[] tab_two) {
		int[] tab_three = new int[tab_one.length];
		for (int i = 0; i < tab_one.length; i++) {
			tab_three[i] = tab_one[i] + tab_two[i];
		}
		return tab_three;
	}

}