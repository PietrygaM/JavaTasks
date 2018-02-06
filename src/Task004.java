public class Task004 {

    public static void main(String[] args) {
        
    	System.out.println("Main4- "+ Task004.createName("Jan", "Kowalski", "JK"));
    }
    
    static String createName (String name, String surname, String nickname) {
        return name+" \""+nickname+"\" "+surname;
        
    }
}
