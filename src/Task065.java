import java.util.Scanner;

public class Task065 {

	public static void main(String[] args) {
		nettoBrutto();
	}

	static void nettoBrutto() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wybierz typ przeliczenia:");
		System.out.println("- bn - zamiana brutto na netto ");
		System.out.println("- nb - zamiana netto na brutto ");

		String type = "";
		while (scan.hasNextLine()) {
			type = scan.nextLine();
			if (type.equals("bn")) {
				System.out.println("Wybrano - zamianę brutto na netto");
				break;
			} else if (type.equals("nb")) {
				System.out.println("Wybrano - zamianę netto na brutto");
				break;
			} else {
				System.out.println("Błędna wartość - wpisz ponownie");
			}
		}

		System.out.println("Wpisz kwotę wg schematu: ");
		Double value = null;
		while (scan.hasNextLine()) {
			if (scan.hasNextDouble()) {
				value = scan.nextDouble();
				System.out.println("Podana kwota to:" + value);
				break;
			} else {
				System.out.println("Błędna wartość - wpisz ponownie");
				scan.next();
			}
		}
		scan.close();
		double result = 0;
		if (type.equals("bn")) {
			result = value / 1.22;
		} else {
			result = value * 1.22;
		}
		System.out.println("Wynik = " + result);
	}
}
