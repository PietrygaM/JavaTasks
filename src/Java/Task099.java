/*Note: Write a solution that only iterates over the string once and uses O(1) 
 * additional memory, since this is what you would be asked to do during a real interview.

Given a string s, find and return the first instance of a non-repeating character in it. 
If there is no such character, return '_'.

Example

    For s = "abacabad", the output should be
    firstNotRepeatingCharacter(s) = 'c'.

    There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears 
    in the string first.

    For s = "abacabaabacaba", the output should be
    firstNotRepeatingCharacter(s) = '_'.

    There are no characters in this string that do not repeat.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] string s

    A string that contains only lowercase English letters.

    Guaranteed constraints:
    1 ≤ s.length ≤ 105.

    [output] char

    The first non-repeating character in s, or '_' if there are no characters that do not repeat.*/


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
