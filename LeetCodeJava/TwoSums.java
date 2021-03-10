import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSums {
    public static void main(String[] args) {
        
        //Prompt: https://leetcode.com/problems/two-sum/
        

        int[] list = {0,4,5,9,15};
        int target1 = 20;
        int target2 = 7;

        System.out.println(Arrays.toString(twoSumsSorted(list, target1)));
        System.out.println(Arrays.toString(twoSumsSorted(list, target2)));
        System.out.println(Arrays.toString(twoSumsSet(list, target1)));
    }

    // Time O(n) Space O(1)
    // Time would be O(nlogn) if the list needs to be sorted
    // Assumption : list is sorted in ascending order
    private static int[] twoSumsSorted(int[] list, int target){
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

    private static int[] twoSumsSet(int[] list, int target){

        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(list[0], 0);

        for(int i = 1; i < list.length ; i++){

            if(map.containsKey(target - list[i])){
                
                ans[0] = map.get(target - list[i]);
                ans[1] = i;

                return ans;
            }

            map.put(list[i], i);

        }
        return ans;
    }



}