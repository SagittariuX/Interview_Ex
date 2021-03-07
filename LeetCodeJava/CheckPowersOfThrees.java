public class CheckPowersOfThrees {
    // https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
    public static void main(String[] args) {
        int n = 21;

        System.out.println(checkPossible(n));
    }

    private static boolean checkPossible(int n){

        while(n > 0 && n % 3 != 2) n /= 3;
        return n == 0;
    }

}
