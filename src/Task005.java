public class Task005 {

	
    public static void main(String[] args) {
        
    	System.out.println("Main5- "+ String.format( "%.2f", calculateNet(110, 0.1)));
    }
    
    static double calculateNet (double gross, double vat) {
        return gross/(1+vat);
    }

}