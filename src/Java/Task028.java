package Java;
public class Task028 {

	public static void main(String[] args) {

		String str = "Kobyła ma mały bok";
		System.out.println(isPalidrom(str));
	}
	
	static boolean isPalidrom(String str) {
		String strToCheck=str.replaceAll(" ", "").toLowerCase();
		char[] word=strToCheck.toCharArray();
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}
	
}
