/*Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

    For n = 1230, the output should be
    isLucky(n) = true;
    For n = 239017, the output should be
    isLucky(n) = false.*/

public class Task090 {

	public static void main(String[] args) {

		System.out.println(isLucky1(1230));
		System.out.println(isLucky1(239017));
		System.out.println(isLucky1(2390171));
		System.out.println(isLucky2(1230));
		System.out.println(isLucky2(239017));
		System.out.println(isLucky1(2390171));
	}

	// Method 1
	public static boolean isLucky1(int n) {
		Integer tmpN = n;
		int sum1 = 0;
		int sum2 = 0;

		char[] charNum = tmpN.toString().toCharArray();

		if (charNum.length % 2 != 0) {
			return false;
		}
		for (int i = 0; i < charNum.length; i++) {
			if (i < (charNum.length / 2)) {
				sum1 += Character.getNumericValue(charNum[i]);
			} else {
				sum2 += Character.getNumericValue(charNum[i]);
			}
		}

		if (sum1 == sum2) {
			return true;
		}
		return false;
	}

	// Method 2
	public static boolean isLucky2(int n) {
		String s = n + "";
		int sum = 0;

		if (s.length() % 2 != 0) {
			return false;
		}

		if (s.length() % 2 == 0) {
			for (int i = 0; i < s.length() / 2; i++) {
				sum += (s.charAt(i) - s.charAt(s.length() - 1 - i));
			}

		}
		return sum == 0;
	}

}
