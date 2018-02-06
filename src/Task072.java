import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task072 {

	public static void main(String[] args) {
		createFile("./src/Task072.txt");
	}

	static void createFile(String fileName) {

		Path path = Paths.get(fileName);
		if (!Files.exists(path)) {
			try {
				Files.createFile(path);
			} catch (IOException e) {
				System.out.println("Błąd tworzenia pliku");
			}

		}

	}

}
