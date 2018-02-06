import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task071 {

	public static void main(String[] args) {
		createDirectory("./src/Task071");
	}

	static void createDirectory(String fileName) {

		Path path = Paths.get(fileName);
		if (!Files.exists(path)) {
			try {
				Files.createDirectory(path);
			} catch (IOException e) {
				System.out.println("Błąd tworzenia katalogu");
				
			}
		}

	}

}
