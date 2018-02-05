/*
W pliku umieść metodę o sygnaturze 
`static String replaceChar(String str, char forReplace, char replacement)`.

1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
 wszystkich zmaków `forReplace` przez znaki `replacement`.

*/

public class Task043 {

	public static void main(String[] args) {

		String str = "abcdefghijk";
		char forReplaceText = 'a';
		char repleacmentText = 'Z';
		System.out.println("Repleace all \""+forReplaceText+"\" by \""+repleacmentText+"\" in text: "+ str);
		System.out.println("Method 1 - "+replaceTab(str, forReplaceText, repleacmentText));
		System.out.println("Method 2 - "+replaceTab2(str, forReplaceText, repleacmentText));

	}

	// Method 1
	static String replaceTab(String str, char forReplace, char replacement) {
		String result = "";
		char[] strTmp = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (strTmp[i] == forReplace) {
				result += replacement;
			} else {
				result += strTmp[i];
			}
			strTmp[i] = replacement;
		}
		return result;
	}
	
	// Method 2
	static String replaceTab2(String str, char forReplace, char replacement) {		
		str= str.replaceAll(Character.toString(forReplace), Character.toString(replacement));
		return str;
	}
}
