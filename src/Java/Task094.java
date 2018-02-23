/*n children have got m pieces of candy. They want to eat as much candy as they can, 
 * but each child must eat exactly the same amount of candy as any other child. 
 * Determine how many pieces of candy will be eaten by all the children together. 
 * Individual pieces of candy cannot be split.

Example

For n = 3 and m = 10, the output should be
candies(n, m) = 9.

Each child will eat 3 pieces. So the answer is 9.*/

package Java;

public class Task094 {

	public static void main(String[] args) {
		System.out.println(candies(3, 10));

	}

	public static int candies(int n, int m) {
	     return (m/n)*n;
	}

	
}
