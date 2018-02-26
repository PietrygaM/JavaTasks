/*Note: Write a solution with O(n) time complexity and O(1) additional space complexity, 
 * since this is what you would be asked to do during a real interview.

Given an array a that contains only numbers in the range from 1 to a.length, find 
the first duplicate number for which the second occurrence has the minimal index. 
In other words, if there are more than 1 duplicated numbers, return the number for which 
the second occurrence has a smaller index than the second occurrence of the other number does. 
If there are no such elements, return -1.

Example

    For a = [2, 3, 3, 1, 5, 2], the output should be
    firstDuplicate(a) = 3.

    There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index 
    x than than second occurrence of 2 does, so the answer is 3.

    For a = [2, 4, 3, 5, 1], the output should be
    firstDuplicate(a) = -1.*/

package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task098 {

	public static void main(String[] args) {

		int[] a = { 2, 3, 3, 1, 5, 2 };
		int[] b = { 2, 3, 3 };
		int[] c = { 8, 4, 6, 2, 6, 4, 7, 9, 5, 8 };
		int[] d = { 1, 1, 2, 2, 1 };
		int[] e = { 2, 2 };
		int[] f = { 2, 1, 3 };

		System.out.println(firstDuplicate1(a));
		System.out.println(firstDuplicate1(b));
		System.out.println(firstDuplicate1(c));
		System.out.println(firstDuplicate1(d));
		System.out.println(firstDuplicate1(e));
		System.out.println(firstDuplicate1(f));

		System.out.println(firstDuplicate2(a));
		System.out.println(firstDuplicate2(b));
		System.out.println(firstDuplicate2(c));
		System.out.println(firstDuplicate2(d));
		System.out.println(firstDuplicate2(e));
		System.out.println(firstDuplicate2(f));

	}

	// Method 1
	public static int firstDuplicate1(int[] a) {
		List<Integer> indexOfRepeatedNumbers = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					indexOfRepeatedNumbers.add(j);
					counter++;
					break;
				}
			}
		}
		Collections.sort(indexOfRepeatedNumbers);

		if (counter != 0) {
			return a[indexOfRepeatedNumbers.get(0)];
		}
		return -1;
	}

	// Method 2
	public static int firstDuplicate2(int[] a) {
		Set<Integer> numbersWithoutRepeat = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			if (numbersWithoutRepeat.contains(a[i])) {
				return i;
			} else {
				numbersWithoutRepeat.add(a[i]);
			}
		}
		return -1;
	}
}