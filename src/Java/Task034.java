package Java;
public class Task034 {

    public static void main(String[] args) {
    	String[] str = {"Ala", "ma", "kota"};
    	System.out.println(stringFromArray(str));
    	System.out.println(stringFromArray2(str));
    }

    // Metoda 1
    static String stringFromArray(String[] str){
        return String.join(" ", str);
    }
    
    // Metoda 2
    static String stringFromArray2(String[] str){
        String text="";
    	for (int i=0; i<str.length; i++) {
        	text+=str[i];
        	text+=" ";
        }
    	return text;
    }
}
