import java.util.StringTokenizer;

public class Task037 {

    public static void main(String[] args) {
    	 String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
    	 System.out.println(countTokent(str));
    }

    static int countTokent(String str) {
    	StringTokenizer tmp = new StringTokenizer(str);
    	return tmp.countTokens();
    }
    
}