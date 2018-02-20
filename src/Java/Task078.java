package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task078 {
	public static void main(String[] args) {

		Map<String, String> set = getMap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Wskaż przeciwieństwa podanych wyrazów");
		int correctAns = 0;
		for (String s : set.keySet()) {
			System.out.println(s);
			String word = sc.next();
			if (set.get(s).equals(word)) {
				correctAns++;
			}
		}
		System.out.println("Udzielono " + correctAns + " poprawnych odpowiedzi");

	}

	public static Map<String, String> getMap() {
		Map<String, String> map = new HashMap<>();
		map.put("cieplo", "zimno");
		map.put("maly", "duzy");
		map.put("lekki", "ciezki");
		map.put("suchy", "mokry");
		map.put("jasny", "ciemny");
		return map;
	}

}
