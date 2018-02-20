package Java;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task068 {

	public static void main(String[] args) {

		File file = new File("./src/Task068.txt");
		double sum = 0.0;
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNext()) {
				String elem = scan.next().replace(",", "");
				Double number;
				try {
					number = Double.valueOf(elem);
					sum += number;
				} catch (NumberFormatException e) {
					System.out.println("Ignoruje wartość -" + elem + "- która nie jest typu double");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		DecimalFormat format = new DecimalFormat("#.00");
		System.out.println("Suma: " + format.format(sum));
	}

}