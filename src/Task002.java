/* 
1. Napisz metodę `static int multiply(int multipler, int index)`,
która zwróci wartość zmiennej `multipler` pomnożoną przez wartość argumentu `index`.
*/

public class Task002 {

    public static void main(String[] args) {
        
    	System.out.println("Main2- " + multiply(2, 2));
    	System.out.println("Main2- " + multiply(3, 4));
    	
    }
    
    static int multiply (int multipler, int index) {
        return multipler*index;
    }
    
}