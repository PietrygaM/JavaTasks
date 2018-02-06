import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task067 {

	public static void main(String[] args) {
		
		File file = new File("./src/Task066.txt");
		StringBuilder reading = new StringBuilder();
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				reading.append(scan.nextLine() + "\n");
			}
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("brak pliku");
		}
		System.out.println(reading.toString());
	}
}
