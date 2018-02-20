package Java;
public class Task084 {

	public static void main(String[] args) {

		int[] array2 = { 1, 6, 3, 2, 5, 8, 9, 7 };
		for (int i: array2) {
			System.out.print(i+", ");
		}
		System.out.println();
		int value = 0;
		for (int j = 1; j < 10; j++) {
			boolean isExist = false;
			value = j;
			for (int i : array2) {
				if (i == j) {
					isExist = true;
					break;
				}
			}
			if (!isExist) {
				break;
			}
		}
		System.out.println("Missing value is - " + value);
		
		
	}

}
