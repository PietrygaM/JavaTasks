public class Task040 {

	private static final String ALPHABET = "abcdefghijklmnoprstuvxyz";

	public static void main(String[] args) {

		String text = "ala ma kota";
		System.out.println("Original text - " + text);
		String cezarCode1 = encode(text, 2);
		System.out.println("Encoded text - " + cezarCode1);
		String cezarCode2 = decode(cezarCode1, 2);
		System.out.println("Decoded text - " + cezarCode2);
	}

	public static String movedAlphabet(int moved) {
		String movedAlphabet = "";
		String[] alphabet = ALPHABET.split("");
		if (moved > ALPHABET.length()) {
			moved = moved - ALPHABET.length();
		}
		for (String s : alphabet) {
			int sIndex = ALPHABET.indexOf(s);
			if ((sIndex + moved) < ALPHABET.length()) {
				s = Character.toString(ALPHABET.charAt(sIndex + moved));
				movedAlphabet += s;
			} else {
				s = Character.toString(ALPHABET.charAt((sIndex + moved) - ALPHABET.length()));
				movedAlphabet += s;
			}
		}
		return movedAlphabet;
	}

	public static String encode(String str, int shift) {
		String movedAlphabet = movedAlphabet(shift);
		String cezar = "";
		char[] charText = str.toCharArray();
		for (char c : charText) {
			if (ALPHABET.indexOf(c) == -1) {
				cezar += c;
			} else {
				cezar += Character.toString(movedAlphabet.charAt(ALPHABET.indexOf(c)));
			}
		}
		return cezar;
	}

	public static String decode(String str, int shift) {
		String movedAlphabet = movedAlphabet(shift);
		String cezar = "";
		char[] charText = str.toCharArray();
		for (char c : charText) {
			if (movedAlphabet.indexOf(c) == -1) {
				cezar += c;
			} else {
				cezar += Character.toString(ALPHABET.charAt(movedAlphabet.indexOf(c)));
			}
		}
		return cezar;
	}	
}
