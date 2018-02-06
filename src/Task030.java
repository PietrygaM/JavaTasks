public class Task030 {

	public static void main(String[] args) {
    	String text= "maLeiDuże";
    	System.out.println(toogleChar(text));  	
    }

	static String toogleChar(String str) {
    	String result="";
    	for (char charText: str.toCharArray()) {
    		if (Character.isLowerCase(charText)) {
    			result+=Character.toUpperCase(charText);
    		} else {
    			result+=Character.toLowerCase(charText);
    		}
    		
    	}
        return result;
    }
}
