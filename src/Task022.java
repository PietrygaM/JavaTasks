/*

W pliku umieść metodę o sygnaturze `static boolean divisibleBy(int a, int b )`: 

1. Uzupełnij ciało metody tak aby zwracała `true` bądź `false` w zależności 
czy zmienna `a` jest podzielna przez `b`.

*/



public class Task022 {

	public static void main(String[] args) {

		System.out.println(divisibleBy(4, 2));
	}

	static boolean divisibleBy(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;

	}

}
