public class Task058 {

	public static void main(String[] args) {

		int[] tab = { 1, 2, 3, 4, 5 };
		try {
			elementExist(tab, 9);
		} catch (Exception e) {
			System.out.println("Złap wyjątek");
		}
	}

	static int elementExist(int[] elements, int value) throws Exception {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == value) {
				return value;
			}
		}
		throw new Exception("Cyfra nie występuje w tabeli");
	}

}
