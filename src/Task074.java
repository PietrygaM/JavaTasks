import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task074 {
	public static void main(String[] args) {

		List<Integer> elements = new ArrayList<>();
		for (int i = 10; i < 20; i++) {
			elements.add(i);
		}
		System.out.println("\nPętla for ------------------------------------------");
		for (int i = 0; i < elements.size(); i++) {
			System.out.print(elements.get(i));
		}
		System.out.println("\nIterator i pętla while  ------------------------------------------");
		Iterator<Integer> it = elements.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
		
		System.out.println("\nIterator i pętla for  ------------------------------------------");
		for (Iterator<Integer> it2 = elements.iterator();it2.hasNext();) {
			System.out.print(it2.next());
		}
		
		System.out.println("\nIterator i pętla for each  ------------------------------------------");
		for (Integer i : elements) {
			System.out.print(i);
		}
	}

}
