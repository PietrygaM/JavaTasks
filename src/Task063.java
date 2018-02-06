/*

stwórz metodę o sygnaturze `static void textLines()`, która:

1. Wczyta kolejne linie tekstu z konsoli, a następnie je wyświetlał, 
program ma zakończyć działanie po wpisaniu `quit`.
2. Wywołaj metodę w metodzie `main`.

*/


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
