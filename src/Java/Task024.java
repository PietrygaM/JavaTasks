package Java;
public class Task024 {

    public static void main(String[] args) {

    	int[][] testTab = {{2, 3, 4, 2, 4}, {12, 32, 12, 11, 4}, {3, 2, 1, 4, 5}, {5, 1, 6, 7, 8}};
    	int[] tab=lessMore(testTab);
    	toDisplay(tab);
    }


    static int[] lessMore(int[][] arr) {
        int[] tab=new int [2];
        double sum = 0;
        double count = 0;
        int less=0;
        int more=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            count += arr[i].length;
        }
        double avg=sum/count;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>avg) {
                    more++;
                }
                else if (arr[i][j]<avg) {
                    less++;
                }
            }
         tab[0]=less;
         tab[1]=more;
        }

        return tab;
    }
    
    static void toDisplay (int[] tab) {
    	for (int el: tab) {
    		System.out.print(el+ ", ");
    	}
    }
}