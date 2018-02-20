package Java;
public class Task045 {

	public static void main(String[] args) {

		String text = "Obrabiany tekst do sprawdzenia i ewentualnie do zamiany";
		String[] forReplaceEx = { "Obrabiany", "do" };

		System.out.println(censor(text, forReplaceEx));
	}

	static String censor(String str, String[] words) {
		String replacementEx = "****";
		String[] tab = str.split(" ");
		String[] tabTmp = new String[tab.length];
		String sentence = "";

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (tab[i].equals(words[j])) {
					tabTmp[i] = replacementEx;
					break;
				}
				else {
					tabTmp[i] = tab[i];
				}
			}

		}
		for (String word : tabTmp) {
			System.out.print(word+" ");
		}
		return sentence;
	}
}
