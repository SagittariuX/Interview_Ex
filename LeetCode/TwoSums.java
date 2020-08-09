import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        
        //Prompt: https://leetcode.com/problems/two-sum/
        // Assumption : list is sorted in ascending order

        int[] list = {0,4,5,9,15};
        int target1 = 20;
        int target2 = 7;

        System.out.println(Arrays.toString(twoSums(list, target1)));
        System.out.println(Arrays.toString(twoSums(list, target2)));
    }

    // Time O(n) Space O(1)
    private static int[] twoSums(int[] list, int target){
        int left = 0;
        int right = list.length-1;
        while(left < right){
            if(list[left]  + list[right] < target){//too small
                left++;
            }else if(list[left] + list[right] > target){//too big
                right--;
            }else{
                return new int[]{left,right};
            }
        }
        return null;
    }
}