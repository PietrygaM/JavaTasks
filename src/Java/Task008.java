package Java;
public class Task008 {

	public static void main(String[] args) {

		System.out.println("Main8- " + maxOfThree(3, 6, 6));
	}

	static int maxOfThree(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
}

