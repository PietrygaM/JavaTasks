/*Given an array a that contains only numbers in the range from 1 to a.length, 
 * find the first duplicate number for which the second occurrence has the minimal index. 
 * In other words, if there are more than 1 duplicated numbers, return the number for which 
 * the second occurrence has a smaller index than the second occurrence of the other number does. 
 * If there are no such elements, return -1.

Example

    For a = [2, 3, 3, 1, 5, 2], the output should be
    firstDuplicate(a) = 3.

    There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index 
    than than second occurrence of 2 does, so the answer is 3.

    For a = [2, 4, 3, 5, 1], the output should be
    firstDuplicate(a) = -1.*/




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task085 {

	public static void main(String[] args) {

		System.out.println("First duplicate method --------------------- ");
		int[] array3 = { 1, 1, 3, 3, 1 };
		System.out.println(firstDuplicate(array3));
		
		
	}

	public static int firstDuplicate(int[] a) {

		List<Integer> repeatIndeksList = new ArrayList<>();

		Integer repeatIndeks = -1;
		for (int i = 1; i < a.length + 1; i++) {
			int counter = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					counter++;
					if (counter == 2) {
						repeatIndeks = j;
						repeatIndeksList.add(j);
						break;
					}
				}
			}
		}

		Collections.sort(repeatIndeksList);

		if (repeatIndeksList.size() > 0 && repeatIndeks != -1) {
			Integer minRepeat = repeatIndeksList.get(0);
			return a[minRepeat];
		}
		return -1;
	}

}
