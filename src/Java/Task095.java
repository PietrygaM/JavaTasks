/*Your friend advised you to see a new performance in the most popular theater in the city. 
 * He knows a lot about art and his advice is usually good, but not this time: 
 * the performance turned out to be awfully dull. It's so bad you want to sneak out, 
 * which is quite simple, especially since the exit is located right behind your row to the left. 
 * All you need to do is climb over your seat and make your way to the exit.

The main problem is your shyness: you're afraid that you'll end up blocking the view 
(even if only for a couple of seconds) of all the people who sit behind you and in your
column or the columns to your left. To gain some courage, you decide to calculate the number 
of such people and see if you can possibly make it to the exit without disturbing too many people.

Given the total number of rows and columns in the theater (nRows and nCols, respectively), 
and the row and column you're sitting in, return the number of people who sit strictly behind 
you and in your column or to the left, assuming all seats are occupied.

Example

For nCols = 16, nRows = 11, col = 5 and row = 3, the output should be
seatsInTheater(nCols, nRows, col, row) = 96.


L1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - L16
K1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - K16
J1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - J16
H1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - H16
G1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - G16
F1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - F16
E1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - E16
D1 -  S,S,S,S,D,D,D,D,D,D,D,D,D,D,D,D  - D16
C1 -  S,S,S,S,X,S,S,S,S,S,S,S,S,S,S,S  - C16
B1 -  S,S,S,S,S,S,S,S,S,S,S,S,S,S,S,S  - B16
A1 -  S,S,S,S,S,S,S,S,S,S,S,S,S,S,S,S  - A16


*/

package Java;

public class Task095 {

	public static void main(String[] args) {

		System.out.println(seatsInTheater(16, 11, 5, 3));
	}

	public static int seatsInTheater(int nCols, int nRows, int col, int row) {

		return (nRows - row) * (nCols - col + 1);
	}

}
