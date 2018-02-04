/* 
Napisz metodę `calculateNet`, która przyjmie argumenty:

* `gross`, czyli kwotę brutto ceny zakupu,
* `vat`, czyli wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową 
* z zakresu 0 - 1.

Funkcja ma zwrócić wartość netto ceny. Jakie obliczenia musisz wykonać?
*/




public class Task005 {

	
    public static void main(String[] args) {
        
    	System.out.println("Main5- "+ String.format( "%.2f", calculateNet(110, 0.1)));
    }
    
    static double calculateNet (double gross, double vat) {
        return gross/(1+vat);
    }

}