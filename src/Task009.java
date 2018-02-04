/* 
Napisz metodę `factorial`, która przyjmie jako parametr liczbę naturalną `n`. 
Funkcja ma zwrócić wartość *n!*, 
czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1..n .
*/



public class Task009 {

	public static void main(String[] args) {

		System.out.println("Main9- " + factorial(3));
		System.out.println("Main9- " + factorial2(3));
	}

	static int factorial(int a) {
		int n = 1;
		for (int i = 1; i <= a; i++) {
			n *= i;
		}
		return n;
	}
	
	static int factorial2(int a) {
		int i = 1;
		int n = 1;
		while (i <= a) {
			n *= i;
			i++;
		}
		return n;
	}
}