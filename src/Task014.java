public class Task014 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		toDisplay(numbers);
		toDisplay(reverse(numbers));
		toDisplay(reverse2(numbers));
	}

	
	static int[] reverse(int[] tab) {
		int[] rev = new int[tab.length];
		int j = tab.length - 1;
		for (int i = 0; i < tab.length; i++) {
			rev[j] = tab[i];
			j--;
		}
		return rev;
	}

	static int[] reverse2(int[] tab) {
		int[] rev = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			rev[i] = tab[tab.length - i - 1];
		}
		return rev;
	}

	static void toDisplay(int[] tab) {
		for (int el : tab) {
			System.out.print(el + ", ");
		}
		System.out.println();
	}

}
