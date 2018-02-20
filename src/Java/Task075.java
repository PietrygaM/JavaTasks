package Java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task075 {
	
	public static void main(String[] args) {
	
		List<Integer> elems = new ArrayList<>();
		for (int i = 10; i < 20; i++) {
			elems.add(i);
		}
		for (Integer i: elems) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------------------------------");
		
		List<Integer> res = removeDivider(elems, 2);
		
		System.out.println("Zmodyfikowana lista zawiera---------------------------");
		for (Integer i: res) {
			System.out.println(i);
		}
	}
	
	
	public static List<Integer> removeDivider (List<Integer> list, int divider) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer val = it. next();
			if (val%divider == 0) {
				it.remove();
			}
		}
		return list;
	}
	
	
	
}
