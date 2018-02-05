/*
W pliku znajduje się program, który zwraca wyjątek.

1. Popraw kod dodając obsługę zwracanego wyjątku.

*/




public class Task052 {

    public static void main(String[] args) {  
    	int num=0;
		try {
			num = Integer.parseInt ("xyz");
	        System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Wystąpił wyjątek");
			e.printStackTrace();
		}
    }
}
