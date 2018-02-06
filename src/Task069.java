import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task069 {

    public static void main(String[] args) {
 

    	File file = new File("./src/Task069.txt");
    	try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String text=scan.nextLine();
				if(text.toLowerCase().contains("java")) {
				System.out.println(text);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
    }
}
