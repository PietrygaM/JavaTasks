package Java;
public class Task029 {

	public static void main(String[] args) {

		String str = "Newtext";
		System.out.println(reverseStr(str));
		System.out.println(reverseStr2(str));
	}

	// Metoda 1
	static String reverseStr(String str) {

		if (str == null) {
			return null;
		}

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;

	}

	// Metoda 2 - REVERSE
	static String reverseStr2(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String text = sb.toString();
		return text;
	}
}
