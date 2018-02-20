package Java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Some people are standing in a row in a park. 
 * There are trees between them which cannot be moved. 
 * Your task is to rearrange the people by their heights in a non-descending order 
 * without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
*/

public class Task091 {

	public static void main(String[] args) {
		int[] a = { -1, 150, 190, 170, -1, -1, 160, 180 };

		print(sortByHeight1(a));
		print(sortByHeight2(a));
	}

	// Method 1
	public static int[] sortByHeight1(int[] a) {
		int tmp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j]<a[i] && a[i]!=-1 && a[j] !=-1) {
					tmp=a[i];
					a[i] = a[j];
					a[j] = tmp;			
				}
			}
		}
		return a;
	}
	
	//Method 2
	public static int[] sortByHeight2(int[] a) { 
		
		List<Integer> tmpHeight = new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				tmpHeight.add(a[i]);
			}
		}
		Collections.sort(tmpHeight);
		
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				a[i] = tmpHeight.get(j++);
			}
		}
		return a;
	}
	
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" , ");
		} 
		System.out.println();
	}
	
	
}
