package Java;
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
