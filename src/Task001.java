public class Task001 {

	public static void main(String[] args) {

		int number = 5;
		int result = square(number);
		System.out.println(result);
		System.out.println(number + "^2 = " + result);
	}

	static int square(int num) {
		int result = num * num;
		return result;
	}

}