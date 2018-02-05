/*
W pliku stwórz metodę o sygnaturze `static void getInfo()`.

W ciele metody dodaj kod który:

1. Poprosi Cię o podanie imienia.
2. Poprosi Cię o podanie wieku.
3. Wypisze na konsoli informacje w formacie `"{imię} ma {wiek} lat"`.
4. Wywołaj metodę w metodzie `main`.

*/

import java.util.Scanner;

public class Task059 {

	public static void main(String[] args) {

		// Method 1
		getInfo();
		// Method 2
		getInfo2();
	}

	// Method 1
	static void getInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj imię i wiek");
		String name = scanner.next();
		int age;

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Podaj wartośc liczbową");
		}

		age = scanner.nextInt();
		System.out.println(name + " ma " + age + " lat.");
	}

	// Method 2
	static void getInfo2() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj imię");
		String name = scan.nextLine();
		System.out.println("Podaj  wiek");
		while (!scan.hasNextInt()) {
			System.out.println("Nie podałeś liczby");
			scan.next();
		}
		int age = scan.nextInt();

		System.out.println(name + " " + age);
		scan.close();
	}
}
