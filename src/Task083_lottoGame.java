import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu 1-49. 
 * Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.

Napisz program, który:

    zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
        czy wprowadzony ciąg znaków jest poprawną liczbą,
        czy użytkownik nie wpisał tej liczby już poprzednio,
        czy liczba należy do zakresu 1-49,
    po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
    wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
    poinformuje gracza, czy trafił przynajmniej "trójkę".

*/

public class Task083_lottoGame {

	public static void main(String[] args) {

		List<Integer> choosenNumbers = choosenNumbers();
		System.out.println("Choosen numbers are:");
		for (Integer i : choosenNumbers) {
			System.out.print(i + ", ");
		}
		System.out.println();
		List<Integer> drawnNumbers = drawnNumbers();
		System.out.println("Drawn numbers are:");
		for (Integer i : drawnNumbers) {
			System.out.print(i + ", ");
		}

		System.out.println();

		listChecker(drawnNumbers, choosenNumbers);

	}

	public static List<Integer> choosenNumbers() {
		List<Integer> choosenNumbers = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 6 numbers from 1 to 49 (without repeating)");

		while (scan.hasNext()) {
			try {
				Integer tmpNum = scan.nextInt();
				if (choosenNumbers.contains(tmpNum)) {
					System.out.println("You already choose this number, try another");
				} else if (tmpNum > 49 || tmpNum < 1) {
					System.out.println("Choosen number is not from 1 to 49, try another");
				} else {
					choosenNumbers.add(tmpNum);
				}
				if (choosenNumbers.size() == 6) {
					Collections.sort(choosenNumbers);
					return choosenNumbers;
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Choosen number has wrong type");
				scan.next();
			}

		}
		Collections.sort(choosenNumbers);
		return choosenNumbers;
	}

	public static List<Integer> drawnNumbers() {
		List<Integer> drawnNumbers = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			drawnNumbers.add(i);
		}
		Collections.shuffle(drawnNumbers);
		drawnNumbers = drawnNumbers.subList(0, 6);
		return drawnNumbers;
	}

	public static void listChecker(List<Integer> firstList, List<Integer> secondList) {
		int counter = 0;
		for (Integer i : firstList) {
			if (secondList.contains(i)) {
				counter++;
			}
		}
		if (counter == 6) {
			System.out.println("You hit 6");
		} else if (counter == 5) {
			System.out.println("You hit 5");
		} else if (counter == 4) {
			System.out.println("You hit 4");
		} else if (counter == 3) {
			System.out.println("You hit 3");
		} else {
			System.out.println("You didn't win, try another time");
		}

	}

}
