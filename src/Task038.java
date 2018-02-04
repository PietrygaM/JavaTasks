/*
umieść metodę o sygnaturze 
`static String[] onlyTwoElements(String str, char separator)`.

1. Uzupełnij ciało metody tak aby, zwracała tablicę dokładnie 2 elementów, 
podzielonych wg pierwszego napotkanego znaku podziału.
Przykład" dla napisu `Java-zadania-podzial-napisow` oraz separatora `-` 
otrzymamy 1 element tablicy `Java` oraz 2 element `zadania-podzial-napisow`.

*/

public class Task038 {

	public static void main(String[] args) {
		String str = "Java-zadania-podzial-napisow";
		
		//Wywołanie Metody 1
		for (String elem : onlyTwoElements1(str, '-')) {
			System.out.println(elem);
		}
		//Wywołanie Metody 2
		System.out.println();
		for (String elem : onlyTwoElements2(str, '-')) {
			System.out.println(elem);
		}
	}
	
	//Metoda 1
	static String[] onlyTwoElements1(String str, char separator) {

		String[] result = new String[2];
		result[0] = str.substring(0, str.indexOf(separator));
		result[1] = str.substring(str.indexOf(separator) + 1, str.length());
		return result;
	}
	//Metoda 2
	static String[] onlyTwoElements2(String str, char separator) {
		String[] result = str.split("-", 2);
		return result;
	}

}