public class SingleNumInArray {
    // https://leetcode.com/problems/single-number/
    public static void main(String[] args) {
        
    }


    private static int singleElement(int[] nums){

        int ans = 0;
        for(int i : nums) ans ^= i;

        return ans;

    }
}
