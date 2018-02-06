public class Task049 {

    public static void main(String[] args) {

    	System.out.println(divide(4, 0));

    }

    static int divide (int a, int b){
		try {
			return a/b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println();
			System.out.println(e);
			System.out.println();
			e.printStackTrace();
			return -1;
			
		}
    }
}
