public class Task033 {

	public static void main(String[] args) {
		String str = "Alamakota";
		String search = "ma";
		System.out.println(containsStr(str, search));
	}

	
	static boolean containsStr(String str, String search) {
		return str.contains(search);
	}
}
