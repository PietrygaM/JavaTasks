/*
W pliku została umieszczona metoda o sygnaturze 
`static boolean containsStr(String str, String search)`.

1. Uzupełnij ciało metody tak aby zwracała informacje czy 
zmienna `str` zawiera w sobie element napisu ze zmiennej `search`.

*/

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
