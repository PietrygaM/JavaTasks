public class Task035 {

	public static void main(String[] args) {

		String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
		String[] tab = str.split(" ");
		for (String word: tab) {
			System.out.println(word);
		}		
	}
}
