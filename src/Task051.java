/*
W pliku znajduje się program z obsługą 2 wyjątków.

1. Uruchom program i zaobserwuj jaki wyjątek jest zwracany.
2. Popraw kod tak aby dodatkowy wyjątek z komentarza był poprawnie obsłużony.

*/

public class Task051 {

	public static void main(String[] args) {
		int a = 1, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception: You can't divide by 0");
		} catch (Exception ex) {
			System.out.println("Exception");
		}
		// } catch (Exception ex) {
		// System.out.println("Exception");
		// }
		// } catch (ArithmeticException ex) {
		// System.out.println("Arithmetic Exception: You can't divide by 0");
		// }

	}
}