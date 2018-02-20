package Java;
public class Task011 {

	public static void main(String[] args) {

		int[] tab = createTable();
		printTable(tab);
		
	}

	static int[] createTable() {
		int[] tab = new int[50];
		for (int i = 0; i < 50; i++) {
			tab[i] = i;
		}
		return tab;
	}

	static void printTable(int[] tab) {
		int counter = 1;
		for (int i = 0; i < tab.length; i++) {
			int number = tab[i];
			String toDisplay = number + ", ";
			if (number < 10) {
				toDisplay = "0" + toDisplay;
			}
			if (counter ==10) {
				System.out.println(toDisplay);
				counter=1;
			}
			else {
				System.out.print(toDisplay);
				counter++;
			}
			}
			
		}

	}

