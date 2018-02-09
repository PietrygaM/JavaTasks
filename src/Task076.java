import java.util.ArrayList;
import java.util.List;

public class Task076 {

	public static void main(String[] args) {

		List<Task076A> test1 = initialize();
		listPrinter(test1);
		System.out.println();
		List<Task076A> test2 = sublist(test1, 0, 3);
		listPrinter(test2);
		System.out.println();
		List<Task076A> test3 = sublist(test1, 0, 7);
		

	}

	public static List<Task076A> initialize() {
		List<Task076A> list = new ArrayList<>();
		int i = 0;
		while (i < 5) {
			list.add(new Task076A("Name" + i, i));
			i++;
		}
		return list;
	}

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

	public static void listPrinter(List<Task076A> list) {
		for (Task076A i : list) {
			System.out.print(i.getName() + ", ");
		}
	}

}
