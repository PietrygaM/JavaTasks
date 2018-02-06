import java.util.Arrays;

public class Task015 {

    public static void main(String[] args) {
        
        int[] numbers= {12,46,9,3,5,15,34,78,66,25};  
        
        Arrays.sort(numbers);
        toDisplay(numbers);
        System.out.println(Arrays.toString(numbers));

        }

    
	static void toDisplay(int[] tab) {
		for (int el : tab) {
			System.out.print(el + ", ");
		}
		System.out.println();
	}
}
