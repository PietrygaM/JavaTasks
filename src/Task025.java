import java.util.Arrays;

public class Task025 {

	public static void main(String[] args) {

		int[] testTab = { 2, 3, 4, 5, 4, 100 };

		int[] tab = append(testTab);
		toDisplay(tab);

	}

	static int[] append(int[] arr) {
		int[] tmpArray = Arrays.copyOf(arr, arr.length * 2);
		int j = arr.length - 1;
		for (int i = tmpArray.length / 2; i < tmpArray.length; i++) {
			tmpArray[i] = arr[j];
			j--;
		}
		return tmpArray;
	}

	static void toDisplay(int[] tab) {
		for (int el : tab) {
			System.out.print(el + ", ");
		}

	}
}
