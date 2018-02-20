package Java;
import java.util.HashSet;
import java.util.Set;

/*Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".*/

public class Task089 {

	public static void main(String[] args) {

		String s1 = "aabcc";
		String s2 = "adcaa";

		System.out.println(commonCharacterCount1(s1, s2));
		System.out.println(commonCharacterCount2(s1, s2));

	}

	// Method 1
	public static int commonCharacterCount1(String s1, String s2) {
		Set<Character> repeated = new HashSet<>();
		int repeatCounter = 0;

		char[] s1CharArray = s1.toCharArray();
		char[] s2CharArray = s2.toCharArray();

		for (Character c1 : s1CharArray) {
			if (s2.contains(Character.toString(c1)) && !repeated.contains(c1)) {
				repeated.add(c1);
				int tmpRepeatInS1 = 0;
				for (Character c1tmp : s1CharArray) {
					if (c1 == c1tmp) {
						tmpRepeatInS1++;
					}
				}

				int tmpRepeatInS2 = 0;
				for (Character c2tmp : s2CharArray) {
					if (c1 == c2tmp) {
						tmpRepeatInS2++;
					}
				}

				if (tmpRepeatInS1 < tmpRepeatInS2) {
					repeatCounter += tmpRepeatInS1;
				} else {
					repeatCounter += tmpRepeatInS2;
				}
			}
		}

		return repeatCounter;
	}

	// Method 2
	public static int commonCharacterCount2(String s1, String s2) {
		int repeatCounter = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(String.valueOf(s1.charAt(i)))) {
				repeatCounter++;
				s2 = s2.replaceFirst(String.valueOf(s1.charAt(i)), "");
			}
		}

		return repeatCounter;
	}

}
