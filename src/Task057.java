public class Task057 {

    public static void main(String[] args) {

    	String text="fsa";
    	System.out.println(toInt(text));
    }

    static int toInt(String str) {
    	try {
			int tmp=Integer.parseInt(str);
			return tmp;
		} catch (NumberFormatException e) {
			System.out.println("Wystąpił wyjątek - wpisano tekst zamiast cyfry");
			System.out.println();
			throw e;
		}
    }
}