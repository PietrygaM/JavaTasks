/* 
Napisz metodę `checkEven`, która:

* przyjmie parametr liczbowy `number`,
* będzie zwracać wartość typu `String`,
* jeśli liczba jest parzysta, zwróci wynik "even",
* jeśli liczba jest nieparzysta, zwróci wynik "odd".
*/

public class Task007 {

	public static void main(String[] args) {

		System.out.println("Main7- " + Task007.checkEven(5));
	}

	static String checkEven(int number) {
		if (number % 2 == 0) {
			return "even";
		}
		return "odd";
	}
}
