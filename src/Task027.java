/*
 napisz program, który:

1. Dla znajdującej się w pliku zmiennej `str` pobierze przedostatnią literę.
2. Wyświetli na konsoli ilość jej wystąpień w naszym ciągu znaków.

*/

public class Task027 {

	public static void main(String[] args) {
		String str = "Simple Text";
		char a=str.charAt(str.length()-2);
		System.out.println(a);
					
		int counter = 0;
		for (char sign: str.toCharArray()) {
			if (sign == a) {
				counter++;
			}
		}
	
		System.out.println(counter);
	}
}

