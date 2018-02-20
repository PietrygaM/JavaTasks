package Java;
public class Task050 {

    public static void main(String[] args) {
        showLength(null);
    }

    static void showLength(String s) {
        try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Wskaż wartość s");
		}
    }
}
