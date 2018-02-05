/*

W pliku została umieszczona metoda o sygnaturze 
`static int divide (int a, int b)`.

1. Uzupełnij ciało metody tak, aby wykonała dzielenie 
argumentu `a` prze `b` a następnie zwróci całkowitą cześć wyniku dzielenia.
2. Obsłuży problem dzielenia przez zero.

*/



public class Task049 {

    public static void main(String[] args) {

    	System.out.println(divide(4, 0));

    }

    static int divide (int a, int b){
		try {
			return a/b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println();
			System.out.println(e);
			System.out.println();
			e.printStackTrace();
			return -1;
			
		}
    }
}
