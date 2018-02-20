package Java;
public class Task007 {

	public static void main(String[] args) {

		System.out.println("Main7- " + Task007.checkEven(5));
	}

	static String checkEven(int number) {
		if (number % 2 == 0) {
			return "even";
		}
		return "odd";
	}
}
