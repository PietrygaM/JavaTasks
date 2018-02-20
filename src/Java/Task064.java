package Java;
import java.util.Scanner;

public class Task064 {

	public static void main(String[] args) {

		equation();
	}

	static void equation() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbę całkowitą a");
		int a = scanner.nextInt();
		System.out.println("Podaj liczbę całkowitą b");
		int b = scanner.nextInt();
		System.out.println("Podaj liczbę całkowitą c");
		int c = scanner.nextInt();
		scanner.close();
		
		if (a == 0) {
			System.out.println("Równanie nie ma rozwiązania; a=0");
		}

		else {
			double delta = (double) ((a * a) - 4 * a * c);
			System.out.println("Delta = " + delta);
			
			if (delta > 0) {
				double x1 = (-b - Math.sqrt(delta)) / (2 * a);
				double x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Mamy dwa pierwiastki równania x1= " + x1 + " oraz x2= " + x2);
			} else if (delta == 0) {
				double x1 = -b / (2 * a);
				System.out.println("Mamy jeden pierwiastek równania x1= " + x1);
			} else {
				System.out.println("Brak pierwiastków równania");
			}
		}

	}
}