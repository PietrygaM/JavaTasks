/*
Szyfr Cezara jest to szyfr za pomocą, którego Juliusz Cezar 
szyfrował swoje listy do Cycerona.

W pliku umieść metodę o sygnaturze `static String encode(String str)`.
 
1. Uzupełnij ciało metody tak, by zwracała napis zaszyfrowany szyfrem Cezara   

*/

public class Task039 {

	private static final String ALPHABET = "abcdefghijklmnoprstuvxyz";
	
	public static void main(String[] args) {

		String text = "ala ma kota";
		System.out.println("Original text - " + text);
		String cezarCode1 = encode(text);
		System.out.println("Encoded text - " + cezarCode1);
	}

	public static String movedAlphabet (int moved) {
		String movedAlphabet="";
		String[] alphabet = ALPHABET.split("");
		if (moved > ALPHABET.length()) {
			moved = moved- ALPHABET.length();
		}
		for (String s:alphabet) {
			int sIndex = ALPHABET.indexOf(s);
			if ((sIndex+moved)<ALPHABET.length()) {
				s=Character.toString(ALPHABET.charAt(sIndex+moved));
				movedAlphabet += s;
			}
			else {
				s=Character.toString(ALPHABET.charAt((sIndex+moved)-ALPHABET.length()));
				movedAlphabet += s;
			}			
		}
		return movedAlphabet;
	}
	
	public static String encode(String str) {
		String movedAlphabet = movedAlphabet(1);
		String cezar="";
		char[] charText = str.toCharArray();
		for (char c:charText) {
			if (ALPHABET.indexOf(c)==-1) {
				cezar += c;
			} else {
				cezar += Character.toString(movedAlphabet.charAt(ALPHABET.indexOf(c)));
			}	
		}		
		return cezar;
	}
	
}
