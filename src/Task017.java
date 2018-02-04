/*
1. Wypisz element znajdujący się w 3 kolumnie i 2 wierszu.
2. Wypisz długość tablicy znajdującej się w drugim rzędzie.
3. Wypisz element znajdujący się w czwartej kolumnie i 3 wierszu.
*/

public class Task017 {

	public static void main(String[] args) {

		int[][] task1Array = { { 2, 3, 4 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
		
        System.out.println(task1Array[1][2]);
        System.out.println(task1Array[2].length);
        System.out.println(task1Array[2][3]);
	}

}
