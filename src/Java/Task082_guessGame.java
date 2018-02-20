package Java;
import java.util.Random;
import java.util.Scanner;

/*Gra w zgadywanie liczb.

Komputer musi wylosować liczbę w zakresie od 1 do 100. Następnie:

    Zadać pytanie: "Zgadnij liczbę" i pobrać liczbę z klawiatury.
    Sprawdzić, czy wprowadzony napis, to rzeczywiście liczba.
    Jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat "Zgadłeś!", 
    po czym zakończyć działanie programu.*/


public class Task082_guessGame {

	public static void main(String[] args) {

		guessNumber(100);
		
	}
	
	// Generate random number
	public static int generateNumber(int range) {
		Random r = new Random();
		return r.nextInt(range) + 1;
	}

	// Find random number
	public static void guessNumber(int range) {
		int numberToFind = generateNumber(range);
		int guessNumber = 0;
		System.out.println("Zgadnij liczbę z zakresu 1 do "+range);
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			try {
				guessNumber = scan.nextInt();
				if (numberToFind > guessNumber) {
					System.out.println("Szukasz większej wartości");
				} else if (numberToFind < guessNumber) {
					System.out.println("Szukasz mniejszej wartości");
				} else if (numberToFind == guessNumber) {
					System.out.println("Zgadłeś");
					break;
				}
			} catch (Exception e) {
				scan.next();
				System.out.println("Podaj wartość typu int");
			}

		}

	}

}
