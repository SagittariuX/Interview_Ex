public class PalindromePartition {
    // https://leetcode.com/problems/palindrome-partitioning/
    public static void main(String[] args) {
        
        int[] prices = {7,1,5,3,6,4};
    }


    private static int maxProfit(int[] prices){

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){

            if(min > prices[i]){
                min = prices[i];
            }else if(prices[i] - min > max){
                max = prices[i] - min;
            }

        }
        return max;
    }

}
