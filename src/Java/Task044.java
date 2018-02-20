package Java;
public class Task044 {

    public static void main(String[] args) {
    	
    	String text="Obrabiany tekst do wymiany";
    	String forReplaceEx="tekst";
    	String replacementEx="treść";

    	System.out.println(replaceStr(text, forReplaceEx, replacementEx)); 	  		
    }
    
    static String replaceStr(String str, String forReplace, String replacement) {
    	String result = str.replaceAll(forReplace, replacement);
    	return result; 
    }
}
