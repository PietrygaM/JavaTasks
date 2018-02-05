/*
W pliku umieść metodę o sygnaturze `static int elementExist(int[] elements, int value)`.

1. Uzupełnij ciało metody tak, aby sprawdzała czy w tablicy `elements` istnieje element o wartości `value`.
2. Jeżeli wartość nie istnieje metoda zwróci wyjątek typu `Exception` z komentarzem `Nie ma takiego numeru!`.
3. Uzupełnij sygnaturę metody informacją że może ona zwracać wyjątek typu `Exception`.

*/

public class Task058 {

	public static void main(String[] args) {

		int[] tab = { 1, 2, 3, 4, 5 };
		try {
			elementExist(tab, 9);
		} catch (Exception e) {
			System.out.println("Złap wyjątek");
		}
	}

	static int elementExist(int[] elements, int value) throws Exception {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == value) {
				return value;
			}
		}
		throw new Exception("Cyfra nie występuje w tabeli");
	}

}
