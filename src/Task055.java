/*


W pliku umieść metodę o sygnaturze 
`static String safeGet(String[] str, int index)`.

1. Uzupełnij ciało metody tak aby zwracała element tablicy `str` 
zawarty pod indeksem `index`.
2. Dodaj obsługę odpowiedniego wyjątku.

*/



public class Task055 {

    public static void main(String[] args) {
    	
    	String[] table = {"Text1", "Text2", "Text3"};
    	int index=3;
    	System.out.println(safeGet(table, index));
    }
    
    static String safeGet(String[] str, int index) {

    	try {
				return str[index];

		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Tablica nie zawiera takiego elementu tablicy");
				throw e;
		}
    }
}
