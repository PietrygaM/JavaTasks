/*Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.array.integer a

    Guaranteed constraints:
    1 ≤ a.length ≤ 100,
    a[i].length = a.length,
    1 ≤ a[i][j] ≤ 104.

    [output] array.array.integer*/

package Java;

public class Task101 {

	public static void main(String[] args) {

		int[][] tab = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] tab2 = rotateImage(tab);

		for (int i = 0; i < tab2.length; i++) {
			System.out.println();
			for (int j = 0; j < tab2[i].length; j++) {
				System.out.print(tab2[i][j] + ",");
			}
		}
	}

	public static int[][] rotateImage(int[][] a) {
		int[][] result = new int[a.length][a[a.length-1].length];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = a[a.length - j-1][i];
			}
		}
		return result;
	}

}
