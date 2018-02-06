public class Task032 {

	public static void main(String[] args) {
		String text = "Alamakota";
		System.out.println(firstHalf(text));
		System.out.println(firstHalf2(text));
	}

	//Metoda 1	
	static String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}
	//Metoda 2
	static String firstHalf2(String str) {
		char[] tableOfString=str.toCharArray();
		String halfOfText="";
		for (int i=0; i<str.length()/2; i++) {
			halfOfText+=tableOfString[i];
		}
		return halfOfText;
	}
	
}
