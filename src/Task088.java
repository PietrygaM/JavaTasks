/*Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"]*/

public class Task088 {

	public static void main(String[] args) {

		String[] inputArray1 = { "aba", "aa", "ad", "vcd", "aba" };
		for (String s : allLongestStrings(inputArray1)) {
			System.out.println(s + ", ");
		}

		String[] inputArray2 = { "abc", "eeee", "abcd", "dcd" };
		for (String s : allLongestStrings(inputArray2)) {
			System.out.println(s + ", ");
		}

	}

	public static String[] allLongestStrings(String[] inputArray) {

		int maxLength = 0;
		for (String s : inputArray) {
			if (s.length() > maxLength) {
				maxLength = s.length();
			}
		}

		int counter = 0;
		for (String s : inputArray) {
			if (s.length() == maxLength) {
				counter++;
			}
		}

		String[] allLongestStrings = new String[counter];
		counter = 0;
		for (String s : inputArray) {
			if (s.length() == maxLength) {
				allLongestStrings[counter] = s;
				counter++;
			}
		}

		return allLongestStrings;

	}

}
