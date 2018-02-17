/*Given a sequence of integers as an array, determine whether it is possible to obtain 
 * a strictly increasing sequence by removing no more than one element from the array.

Example

    For sequence = [1, 3, 2, 1], the output should be
    almostIncreasingSequence(sequence) = false;

    There is no one element in this array that can be removed in order to get a strictly increasing sequence.

    For sequence = [1, 3, 2], the output should be
    almostIncreasingSequence(sequence) = true.

    You can remove 3 from the array to get the strictly increasing sequence [1, 2]. 
    Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
*/

public class Task086 {

	public static void main(String[] args) {

		int[] testArray = { 1, 3, 2, 1 };
		System.out.println("almostIncreasingSequence --------------------- ");
		System.out.println(almostIncreasingSequence(testArray));

	}
	
	
	

	public static boolean almostIncreasingSequence(int[] sequence) {

		int counter = 0;
		for (int i = 0; i < sequence.length - 1; i++) {
			if ((sequence[i + 1] <= sequence[i])) {
				counter++;
				if (i - 1 >= 0 && i + 2 <= sequence.length - 1 && sequence[i] - sequence[i + 2] >= 0
						&& sequence[i - 1] - sequence[i + 1] >= 0) {
					return false;
				}
			}
		}
		return counter <= 1;
	}

}
