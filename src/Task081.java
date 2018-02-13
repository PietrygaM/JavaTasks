import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Task081 {

	public static void main(String[] args) {

		// Generate set with number from 1-100 (without repeat)
		int max = 100;
		Set<Integer> tmpSet = new HashSet<>();
		Random r = new Random();

		while (tmpSet.size() < max - 1) {
			tmpSet.add(r.nextInt(max) + 1);
		}

		Iterator<Integer> it = tmpSet.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ,");
		}
		System.out.println("----------------------------------");
		System.out.println(tmpSet.size());
		System.out.println("----------------------------------");
		for (Integer i = 1; i < tmpSet.size()+1; i++) {
			if (!tmpSet.contains(i)) {
				System.out.println("You are looking for - " + i);
				break;
			}
		}
		System.out.println("----------------------------------");

	}

}
