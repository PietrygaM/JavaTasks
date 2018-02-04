/*
napisz program, który:

1. Dla znajdującej się w pliku zmiennej `str` podzieli napis na wyrazy. 
2. Wyświetli na konsoli każdy w oddzielnej lini.

*/


public class Task035 {

	public static void main(String[] args) {

		String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
		String[] tab = str.split(" ");
		for (String word: tab) {
			System.out.println(word);
		}		
	}
}
