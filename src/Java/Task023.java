package Java;
import java.util.Arrays;

public class Task023 {

    public static void main(String[] args) {
        
    	int[][] task2Array = {{2, 3, 4, 2, 4}, {12, 32, 12, 11, 4}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
    	int[] tab= minimum(task2Array);
    	toDisplay(tab);
    	
    }

    static int[] minimum(int[][] arr) {
        int[] tab = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            tab[i] = arr[i][0];
        }
        return tab;
    }

    static void toDisplay (int[] tab) {
    	for (int minTab: tab) {
    		System.out.print(minTab+ ", ");
    	}
    }


}
