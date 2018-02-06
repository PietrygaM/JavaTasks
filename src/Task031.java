public class Task031 {

	public static void main(String[] args) {

		String text = "Alamakota";
		char c = 'A';
		System.out.println(charPos(text, c));
		System.out.println(charPos2(text, c));
	}

	// Sposób 1
	static int charPos(String str, char c) {
		return str.indexOf(c);
	}

	// Sposób 2
	static int charPos2(String str, char c) {
		int counter=0;
		for (char sign : str.toCharArray()) {
			if (sign != c) {
				counter++;
			} else {
				return counter;
			}
		
		}
		return counter;	
	}
}
