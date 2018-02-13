import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task080 {

	public static void main(String[] args) {
		
		
		final Integer tmp1 = 1;
		final List<Integer> tmp2 = new ArrayList<>();
		
		tmp2.add(2);
		
		
		String text1="text";
		String text2= new String("text");
		
		Set <Integer> inty = new HashSet<>();
		inty.add(1);
		inty.add(2);
		
		Iterator<Integer> it = inty.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
	
}
