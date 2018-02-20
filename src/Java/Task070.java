package Java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task070 {

	public static void main(String[] args) {

		File newFile= new File("./src/Task070.txt");
		try {
			Scanner scan = new Scanner(newFile);
			StringBuffer sb = new StringBuffer();
			while (scan.hasNextLine()) {
				String text=scan.nextLine();
				sb.append(text).append("--");
			}
			scan.close();
			String tmpText=sb.toString();
			String[] array = tmpText.split("--");
			Arrays.sort(array);
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(i+1+" "+array[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
