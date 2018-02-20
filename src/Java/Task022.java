package Java;
public class Task022 {

	public static void main(String[] args) {

		System.out.println(divisibleBy(4, 2));
	}

	static boolean divisibleBy(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;

	}

}
