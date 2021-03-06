import java.time.chrono.MinguoChronology;

public class MaximumScore {
    static int[] nums = {1,2,3};

    static int[] multi = {3,2,1};

    static Integer[][] dp = new Integer[multi.length][multi.length];
    // https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/
    public static void main(String[] args) {
        
        
        System.out.println(maxScore(nums, multi));

    }

    private static int maxScore(int[] nums, int[] multi){
        
        return calculateScore(0,0);
    }

    private static int calculateScore(int left, int mIndex){

        if(mIndex == multi.length) return 0;
        if(dp[left][mIndex] != null) return dp[left][mIndex];
        int pickLeft = calculateScore(left+1, mIndex+1) + nums[left] * multi[mIndex];
        int pickRight = calculateScore(left, mIndex+1) + nums[nums.length - 1 - (mIndex - left)] * multi[mIndex];

        return dp[left][mIndex] = Math.max(pickRight, pickLeft);

    }
    
}
