public class Task006 {

    public static void main(String[] args) {
        
    	System.out.println("Main6- "+ checkMaturity(16));
    }
    
    static boolean checkMaturity (int age) {

        if (age>=18) {
                return true;
        }
        return false;
    }
}
