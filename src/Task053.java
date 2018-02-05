/*
W pliku znajduje się program, który zwraca wyjątek.

1. Popraw kod dodając obsługę zwracanego wyjątku.

*/

public class Task053 {

    public static void main(String[] args) {
        String str = null;
        try {
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("Wystąpił wyjątek");
			e.printStackTrace();
		}
    }


}
