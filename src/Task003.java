/* 
Napisz metodę `convertToUsd`, która przyjmuje parametr `zlotys`, czyli kwotę w złotówkach.
 Funkcja ma zwrócić podaną kwotę w dolarach amerykańskich. 
 Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.
*/

public class Task003 {

	private final static double USD=4.04;
	
    public static void main(String[] args) {
        double result= convertToUsd(10.0);
        System.out.println(result);
        System.out.println("Test"+ convertToUsd(2));
        System.out.println("Test"+ convertToUsd(45));
    }
    
    static double convertToUsd (double zlotys) {
        return zlotys/USD;
    }
    
}
