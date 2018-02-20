package Java;
import java.util.Random;

public class Task012 {

	public static void main(String[] args) {

		int[] tab = createTab();
		displayTab(tab);
		System.out.println(min(tab));
	}

	static int[] createTab() {
    	int[] tab= new int[20];
    	Random r = new Random();
    	for (int i=0; i<tab.length; i++) {
    		tab[i] = r.nextInt(101);
    	}
    	return tab;
    }

	static void displayTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] +", ");
		}
		System.out.println();
	}

	static int min(int[] tab) {
		int min = tab[0];
		for (int number : tab) {
				if (number <min) {
					min=number;
				}
		}
		return min;
	}

}