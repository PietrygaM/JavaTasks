package Java;
public class Task010 {

    public static void main(String[] args) {
        
    	  System.out.println(("Main10- "+Task010.footballWin(0,2,3,1)));
    }
    
    static String footballWin (int a1, int b1, int a2, int b2) {
        int sum_a=a1+a2;
        int sum_b=b1+b2;
        String score;
            if (sum_a>sum_b) {
                score="1";
            }
            else if (sum_a<sum_b) {
                score="2";
            }
            else {
                if (b1<a2) {
                    score="1";
                }
                else if (b1>a2) {
                    score="2";
                }
                else score="X";
            }
         return score;
    }
}
