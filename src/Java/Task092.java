/*You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
addTwoDigits(n) = 11.*/

package Java;

public class Task092 {

	public static void main(String[] args) {
		
		System.out.println(addTwoDigits1(10));
		System.out.println(addTwoDigits2(10));
		System.out.println(addTwoDigits1(45));
		System.out.println(addTwoDigits2(45));
		System.out.println(addTwoDigits1(99));
		System.out.println(addTwoDigits2(99));
		
	}

	// Method 1
	public static int addTwoDigits1(int n) {
		String s = n + "";
		int sum = 0;
		for (char c : s.toCharArray()) {
			sum += Character.getNumericValue(c);
		}
		return sum;
	}

	//Method 2
	public static int addTwoDigits2(int n) {
		return n/10+n%10;
	}
	
	
}
