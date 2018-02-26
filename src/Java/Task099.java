package Java;

import java.util.ArrayList;
import java.util.List;

public class Task099 {

	public static void main(String[] args) {

		System.out.println(firstNotRepeatingCharacter("abacabaabacaba"));

	}

	public static char firstNotRepeatingCharacter(String s) {
		char[] inputText = stringToCharArray(s);
		char firstNotRepeatingCharacter = '_';
		List<Character> onceList = listOfOnceElements(inputText);
		if (onceList.size() >= 1) {
			firstNotRepeatingCharacter = onceList.get(onceList.size() - 1);
			return firstNotRepeatingCharacter;
		}
		return firstNotRepeatingCharacter;
	}

	public static char[] stringToCharArray(String s) {
		return s.toCharArray();
	}

	public static List<Character> listOfOnceElements(char[] c) {
		List<Character> onceList = new ArrayList<>();
		List<Character> duplicateList = new ArrayList<>();

		for (int i = c.length - 1; i >= 0; i--) {
			if (onceList.contains(c[i])) {
				duplicateList.add(c[i]);
			} else {
				onceList.add(c[i]);
			}
		}
		onceList.removeAll(duplicateList);
		return onceList;
	}

}
