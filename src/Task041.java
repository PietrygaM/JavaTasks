public class Task041 {

    public static void main(String[] args) {

    	String str="Jakiś tekst";
    	int index=3;
    	System.out.println(upperCase(str, index));
    }

    static String upperCase(String str, int index) {
    	String tmp=str.toUpperCase();
    	char[] tmpUpperCase= tmp.toCharArray();
    	char[] formatedText = str.toCharArray();
    	String text="";
    	for (int i=0; i<str.length(); i++) {
    		if (i%index==0) {
    			formatedText[i]=tmpUpperCase[i];
    		}
    		text+=formatedText[i];
    	}
    	return text;
    }
    
}
