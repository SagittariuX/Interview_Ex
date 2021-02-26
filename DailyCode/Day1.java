import java.util.Arrays;
import java.util.HashSet;

public class Day1 {
    
    public static void main(String[] args) {
        
        //Assuming nums will be filled and has more than 1 int 
        int[] nums = {10, 15, 3, 7};

        int k = 17;

        System.out.println(twoSumIsK(nums, k));
        System.out.println(twoSumIsKOptimized(nums, k));
        System.out.println(twoSumIsKHash(nums, k));

    }

    //naive solution
    //for loop and for loop 
    //Time: O(n*n) Space (1)
    private static boolean twoSumIsK(int[] nums, int k){

        for(int i: nums){

            for(int j: nums) if (i + j == k) return true;

        }

        return false;
    }

    //sort list first
    //then look at both side slowly move towards the middle
    //Time: O(nlogn) Space(1)
    private static boolean twoSumIsKOptimized (int[] nums, int k){

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left != right){
            
            if(nums[left] + nums[right] == k){
                return true;
            }else if(nums[left] + nums[right] < k){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }

    //Store possible solutions in a hashset
    //Go thorough the list and store possible solution in a list
    //Time: O(n) Space: O(n)
    private static boolean twoSumIsKHash (int[] nums, int k){

        HashSet<Integer> set = new HashSet<Integer>();

        for(int n: nums){

            if(set.contains(n)){
                return true;
            }else{
                set.add(k - n);

            }

        }

        return false;
    }
}
