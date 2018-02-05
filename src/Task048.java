/*
napisz program który:

1. Do kodu znajdującego się w pliku dodaj obsługę wyjątku ArrayIndexOutOfBoundsException.

*/

public class Task048 {

    public static void main(String[] args) {
    	
    	int[] tab = {  5, 1, 6, 7, 8 } ;
		try {
			System.out.println(tab[21]);
		} catch (Exception e) {
			e.printStackTrace();
		}


    }
}
