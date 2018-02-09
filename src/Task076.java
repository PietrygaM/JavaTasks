import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task076 {

	public static void main(String[] args) {

		System.out.println("Initialize list");
		List<Task076A> test1 = initialize();
		listPrinter(test1);
		System.out.println("Sublist from start to end");
		List<Task076A> test2 = sublist(test1, 0, 3);
		listPrinter(test2);
		System.out.println();
		List<Task076A> test3 = sublist(test1, 0, 7);
		System.out.println("Reverse with listIterator");
		List<Task076A> test4 = reverse(test1);
		listPrinter(test4);
	}

	// Initialize list
	public static List<Task076A> initialize() {
		List<Task076A> list = new ArrayList<>();
		int i = 0;
		while (i < 5) {
			list.add(new Task076A("Name" + i, i));
			i++;
		}
		return list;
	}

	// Return sublist
	public static List<Task076A> sublist(List<Task076A> list, int start, int end) {
		if (start < end && end <= list.size() && start >= 0) {
			List<Task076A> subList = new ArrayList<>();
			for (int i = start; i <= end; i++) {
				subList.add(list.get(i));
			}
			return subList;
		} else {
			System.out.println("Wrong params");
			return null;
		}
	}

	public static List<Task076A> sublist2(List<Task076A> list, int start, int end) {
		return list.subList(start, end);
	}

	// Return reverse list with listIterator
	public static List<Task076A> reverse(List<Task076A> list) {
		ListIterator<Task076A> litr = list.listIterator(list.size());
		List<Task076A> tmpList = new ArrayList<>();
		while (litr.hasPrevious()) {
			tmpList.add(litr.previous());
		}
		return tmpList;
	}
	
	public static void listPrinter(List<Task076A> list) {
		for (Task076A i : list) {
			System.out.print(i.getName() + ", ");
		}
	}

	
	
	
}
