/*
W pliku umieść metodę o sygnaturze `static int getLength(String str)`.

1. Uzupełnij ciało metody tak, aby zwracała długość napisu `str`.
2. Obsłuż wyjątek wywołania metody `getLength(null)`.

*/

public class Task056 {

    public static void main(String[] args) {
    	
    	String str2=null;
    	getLength(str2);
    	
    }

    static int getLength(String str) {
    	
    	try {
			int tmp=str.length();
			return tmp;
		} catch (Exception e) {
			System.out.println("Błąd - tekst ma wartość null");
			System.out.println();
			throw e;
		}
    	
    	
    }
}