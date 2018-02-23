/*Given an integer n, return the largest number that contains exactly n digits.

Example

For n = 2, the output should be
largestNumber(n) = 99.*/

package Java;

public class Task093 {

	public static void main(String[] args) {

		System.out.println(largestNumber1(2));

	}

	// Method 1
	public static int largestNumber1(int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += "9";
		}
		return Integer.valueOf(result);
	}

}
