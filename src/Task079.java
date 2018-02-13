import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task079 {
	public static void main(String[] args) {

		Map<String, Task079A> map = getMap(initialize());
		System.out.println("Method 1");
		for (Map.Entry<String, Task079A> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue().getName());
		}
		System.out.println("Method 2");
		for (String entry: map.keySet()) {
			System.out.println(entry+ "-"+ map.get(entry).getName());
		}
		
	}

	public static List<Task079A> initialize() {
		List<Task079A> tmp = new ArrayList<>();
		tmp.add(new Task079A("Poland", "Warsaw"));
		tmp.add(new Task079A("Germany", "Berlin"));
		tmp.add(new Task079A("England", "London"));
		tmp.add(new Task079A("France", "Paris"));
		return tmp;
	}

	public static Map<String, Task079A> getMap(List<Task079A> list) {
		Map<String, Task079A> mapList = new HashMap<>();
		for (Task079A tmp : list) {
			mapList.put(tmp.getCapital(), tmp);
		}
		return mapList;
	}

}
