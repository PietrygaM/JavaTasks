/*Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such 
 * a way that each column, each row, and each of the nine 3 × 3 sub-grids that compose the grid all 
 * contain all of the numbers from 1 to 9 one time.

Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku 
puzzle according to the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.

Example

    For

    grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
            ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
            ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
            ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
            ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
            ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
            ['.', '.', '.', '5', '.', '.', '.', '7', '.']]

    the output should be
    sudoku2(grid) = true;

    For

    grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
            ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
            ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
            ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
            ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
            ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
            ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
            ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
            ['.', '2', '.', '.', '3', '.', '.', '.', '.']]

    the output should be
    sudoku2(grid) = false.

    The given grid is not correct because there are two 1s in the second column. Each column, each row, 
    and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.

Input/Output

    [execution time limit] 3 seconds (java)

    [input] array.array.char grid

    A 9 × 9 array of characters, in which each character is either a digit from '1' to '9' or a period '.'.

    [output] boolean

    Return true if grid represents a valid Sudoku puzzle, otherwise return false.
*/

package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task102 {

	public static void main(String[] args) {

		char[][] grid = { { '.', '.', '.', '1', '4', '.', '.', '2', '.' },
							{ '.', '.', '6', '.', '.', '.', '.', '.', '.' }, 
							{ '.', '.', '.', '.', '.', '.', '.', '.', '.' },
							{ '.', '.', '1', '.', '.', '.', '.', '.', '.' }, 
							{ '.', '6', '7', '.', '.', '.', '.', '.', '9' },
							{ '.', '.', '.', '.', '.', '.', '8', '1', '.' }, 
							{ '.', '3', '.', '.', '.', '.', '.', '.', '6' },
							{ '.', '.', '.', '.', '.', '7', '.', '.', '.' }, 
							{ '.', '.', '.', '5', '.', '.', '.', '7', '.' } };

		System.out.println(sudoku2(grid));

	}

	public static boolean sudoku2(char[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			ArrayList<Character> colList = new ArrayList<>();
			ArrayList<Character> rowList = new ArrayList<>();
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] != '.' && rowList.contains(grid[i][j])) {
					return false;
				}
				rowList.add(grid[i][j]);
				if (grid[j][i] != '.' && colList.contains(grid[j][i])) {
					return false;
				}
				colList.add(grid[j][i]);
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Set<Character> cellSet = new HashSet<>();
				for (int m = 0; m < 3; m++) {
					int row = i * 3 + m;
					for (int n = 0; n < 3; n++) {
						int col = j * 3 + n;
						if ((grid[row][col]) != '.' && cellSet.contains(grid[row][col])) {
							return false;
						}
						cellSet.add(grid[row][col]);
					}
				}
			}
		}
		return true;
	}

}
