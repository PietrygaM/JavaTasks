import java.util.Scanner;

public class Task060 {

	public static void main(String[] args) {
		operations();
	}

	static void operations() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbę a");
		int numberA = scanner.nextInt();
		System.out.println("Podaj liczbę b");
		int numberB = scanner.nextInt();
		scanner.close();
		
		System.out.println("A + B= " +(numberA+numberB));
		System.out.println("A - B= " +(numberA-numberB));
		System.out.println("A * B= " +(numberA*numberB));
		System.out.println("A / B= " +(numberA/numberB));
	}

}
