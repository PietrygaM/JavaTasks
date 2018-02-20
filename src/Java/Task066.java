package Java;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task066 {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("./src/Task066.txt");
			Scanner scan = new Scanner(System.in);
			while (scan.hasNextLine()) {
				String text = scan.nextLine();
				if (text.equals("quit")) {
					System.out.println("Koniec");
					scan.close();
					writer.close();
					return;
				}
				writer.append(text + "\n");
			}
			scan.close();
			writer.close();
		} catch (IOException e) {
			System.out.println("Błąd tworzenia pliku");
			e.printStackTrace();
		}

	}
}
