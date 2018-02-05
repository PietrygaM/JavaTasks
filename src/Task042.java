/*
W pliku umieść  metodę  o sygnaturze `static int tripple(String str)` 
1. Metoda zwraca ilość potrójnych wystąpień znaków w napisie
Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2

*/

public class Task042 {

	public static void main(String[] args) {
		String text = "abcbbccccdaa";
		System.out.println(tripple(text));
	}

	static int tripple(String str) {
		int countRepeat = 0;

		for (int i = 0; i < str.length(); i++) {
			int counterTmp = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(i) == str.charAt(j)) && (i != j)) {
					counterTmp++;
				}
			}
			if (counterTmp == 2) {
				countRepeat++;
			}
		}

		return countRepeat / 3;
	}

}
