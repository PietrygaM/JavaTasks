/*
W pliku umieść metodę o sygnaturze `static int toInt(String str)`.

1. Uzupełnij ciało metody tak, aby zwracała zamieniony napis `str` na typ int.
2. Obsłuż możliwe wyjątki.

*/


public class Task057 {

    public static void main(String[] args) {

    	String text="fsa";
    	System.out.println(toInt(text));
    }

    static int toInt(String str) {
    	try {
			int tmp=Integer.parseInt(str);
			return tmp;
		} catch (NumberFormatException e) {
			System.out.println("Wystąpił wyjątek - wpisano tekst zamiast cyfry");
			System.out.println();
			throw e;
		}
    }
}