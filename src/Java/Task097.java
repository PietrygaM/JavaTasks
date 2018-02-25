/*Consider integer numbers from 0 to n - 1 written down along the circle in such a way 
that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 
		are neighbouring, too).

Given n and firstNumber, find the number which is written in the radially opposite position 
to firstNumber.

[input] integer n

A positive even integer.

Guaranteed constraints:
4 ≤ n ≤ 20.

[input] integer firstNumber

Guaranteed constraints:
0 ≤ firstNumber ≤ n - 1.

[output] integer



Example

For n = 10 and firstNumber = 2, the output should be
circleOfNumbers(n, firstNumber) = 7.*/

package Java;

public class Task097 {

	public static void main(String[] args) {

		System.out.println(circleOfNumbers1(8, 5));
		System.out.println(circleOfNumbers2(8, 5));
		
		System.out.println(circleOfNumbers1(8, 1));
		System.out.println(circleOfNumbers2(8, 1));
	}

	// Method 1
	public static int circleOfNumbers1(int n, int firstNumber) {
		if (firstNumber < n / 2) {
			return n / 2 + firstNumber;
		} else {
			return firstNumber - n / 2;
		}
	}
	
	//Method 2
	public static int circleOfNumbers2(int n, int firstNumber) {
	    return (firstNumber + n/2) % n;
	}
	
}
