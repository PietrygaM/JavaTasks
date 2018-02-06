public class Task027 {

	public static void main(String[] args) {
		String str = "Simple Text";
		char a=str.charAt(str.length()-2);
		System.out.println(a);
					
		int counter = 0;
		for (char sign: str.toCharArray()) {
			if (sign == a) {
				counter++;
			}
		}
	
		System.out.println(counter);
	}
}

