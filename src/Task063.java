import java.util.Scanner;

public class Task063 {

    public static void main(String[] args) {
    	
    	textLines();

    }
    
    static void textLines() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Wpisuj tekst");
    	while (scanner.hasNextLine()) {
    		String text=scanner.nextLine();

    		if (text.equals("quit")){
    			System.out.println("Koniec programu - wpisano quit");
    			scanner.close();
    			return;
    		}
    		System.out.println(text);
    		
    	}
		scanner.close();
    }
}
