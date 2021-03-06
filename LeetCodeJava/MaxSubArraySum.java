public class MaxSubArraySum{
    // https://leetcode.com/problems/maximum-subarray/
    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        System.out.println(maxSubArray(nums));

    }

    private static int maxSubArray(int[] nums){
        
        int res = Integer.MIN_VALUE;
        int sum = 0;

        for(int n: nums){

            sum = Math.max(sum, 0) + n;
            res = Math.max(res, sum);

        }
        return res;
    }

}