

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task077 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wprowadź wyrazy i po kazdym wciśnij enter. Wyraz 'Exit' zakończy prowadzanie ");
		String word = sc.next();
		int count = 0;
		while (!"exit".equals(word)) {// dopóki pod zmienną word jest coś innego niż exit to wykonuj pętlę
			count ++;
			set.add(word);
			word = sc.next();
		}
		
		System.out.println("Wprowadzono " + count + " wyrazów, Set zawiera "+ set.size()+ " wyrazów");
		

	}

}
