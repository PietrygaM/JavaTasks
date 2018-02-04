/*
napisz program, który:

1. Dla znajdującej się w pliku zmiennej `str` 
podzieli napis na zdania. Znakiem podziału jest kropka `(.)` .
2. Wyświetli na konsoli każde zdanie w oddzielnej lini.

*/




public class Task036 {

    public static void main(String[] args) {

    String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
            " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book." +
            " It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
    
    String[] parts = str.split("[.] ");
    for (String word: parts) {
		System.out.println(word);
	}
    
    
    }
}
