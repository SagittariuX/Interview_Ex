
public class MaxVolume {
    //Prompt: https://leetcode.com/problems/container-with-most-water/
    
    public static void main(String[] args) {
        int[] list = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxVolume(list));
    }   
    
    
    private static int maxVolume(int[] list){
        int left = 0, right = list.length-1;
        int max = 0;
        while(left < right){
            max = Math.max(max, Math.min(list[left], list[right])*(right-left));
            if(list[left] < list[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return max;
    }
}