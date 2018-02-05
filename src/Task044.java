/*
W pliku umieść metodę o sygnaturze 
`static String replaceStr(String str, String forReplace, String replacement)`.

1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
 wszystkich wystąpień napisu `forReplace` przez napis `replacement`.

*/

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
