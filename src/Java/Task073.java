package Java;

/*Napisz program, który będzie pobierał od użytkownika imiona. 
 * Program powinien pozwolić użytkownikowi na wprowadzenie dowolnej 
 * liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie). 
 * Na zakończenie wypisz liczbę unikalnych imion.
*/


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task073 {

	public static void main(String[] args) {

		Set<String> list = inputName();
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	public static Set<String> inputName() {
		Set<String> nameList = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String text = scan.next();
			if (text.equals("-")) {
				System.out.println("Koniec");
				scan.close();
				return nameList;
			}
			nameList.add(text);
		}
		return nameList;	
	}

}