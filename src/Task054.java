public class Task054 {

	public static void main(String[] args) {

		String a = "2";
		String b = "e";
		average(a, b);

	}

	static void average(String a, String b) {

		try {
			int aInt = Integer.parseInt(a);
			int bInt = Integer.parseInt(b);
			int divide = aInt / bInt;
			System.out.println("Divide = " + divide);
		} catch (NumberFormatException e) {
			System.out.println("Liczba nie może być konwertowana do typu Integer");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Nie dziel przez Zero");
			e.printStackTrace();

		}
	}
}
