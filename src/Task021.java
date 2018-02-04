/*
W pliku `Main1.java` umieść metodę o sygnaturze `static double dogAge(double dogAge)` 
, która przeliczy wiek psa w psich latach. 

* funkcja powinna przyjmować wiek psa jako parametr,
* dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
* powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
* funkcja powinna zwrócić wiek psa.

##### Przykład:
```
dogAge(1.5)  # spodziewany wynik: 1.5 * 10.5 = 15.75

dogAge(5)  # spodziewany wynik: 2 * 10.5 + 3 * 4 = 33
```

*/


public class Task021 {

    public static void main(String[] args) {
    	
    	System.out.println(dogAge(5));

    }

    static double dogAge (double dogAge) {
        double tmp;

        if (dogAge<=2) {
            tmp=dogAge*10.5;
        }
        else {
            tmp=2*10.5+(dogAge-2)*4;
        }
        return tmp;
    }
    
}
