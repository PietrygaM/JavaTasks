package Java;
import java.util.Scanner;

public class Task061 {

	public static void main(String[] args) {
		getData();
		// getData2();
	}

	static void getData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wpisuj liczby");
		int sum = 0;
		int counter = 0;
		int value = 0;

		while (scanner.hasNext()) {
			try {
				value = scanner.nextInt();

				if (value != 0) {
					counter++;
					sum += value;
					System.out.println("Ilość wprowdzonych liczb " + counter + " Suma liczb to " + sum);
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("Podaj poprawną wartość");

			}
			if (value == 0) {
				System.out.println("Zakończenie programu");
				return;
			}
		}

		scanner.close();
	}

	static void getData2() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int counter = 0;
		System.out.println("Podaj cyfrę");
		int number = scan.nextInt();
		while (scan.hasNext()) {
			try {
				number = scan.nextInt();
				sum += number;
				counter++;
			} catch (Exception e) {
				System.out.println("Nie podałeś cyfry");
				scan.next();

			}

			if (number == 0) {
				System.out.println("Koniec programu");
				System.out.println("suma =" + sum);
				System.out.println("counter =" + counter);
				scan.close();
				return;
			}

		}
		scan.close();

	}

}