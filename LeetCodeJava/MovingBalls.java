import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
public class MovingBalls {
    
    public static void main(String[] args) {
        
        String s1 = "110";
        String s2 = "001011";


        System.out.println( Arrays.toString(movingBalls(s2)));
    }

    //basic idea is to count the first left to right
    //then right to left
    private static int[] movingBalls(String s){

        int[] ans = new int[s.length()];
        int counter = 0;
        int ops = 0 ;

        for(int i = 0; i < s.length() - 1 ; i++){

            counter += s.charAt(i) == '1' ? 1 : 0 ;
            ops += counter;
            ans[i+1] += ops;

        }
        counter = 0;
        ops = 0;
        for(int i = s.length() - 1; i >= 1 ; i--){

            counter += s.charAt(i) == '1' ? 1 : 0 ;
            ops += counter;
            ans[i-1] += ops;

        }


        return ans;

    }

}
