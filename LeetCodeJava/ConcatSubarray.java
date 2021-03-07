import java.util.ArrayList;

public class ConcatSubarray {
    
    public static void main(String[] args) {
        
        int[][] groups = {{-5, 0}};
        int[] nums = {2,0,-2,5,-1,2,4,3,4,-5,-5};
    
        System.out.println(canChoose(groups, nums));
    }

    private static boolean canChoose(int[][] groups, int[] nums){


        ArrayList<Integer> quickRestart = new ArrayList<>();
        int trackGroup = 0;
        int combo = 0;
        int found = 0;

        for(int i = 0 ; i < nums.length; ){

            if(groups[trackGroup][0] == nums[i]){
                quickRestart.add(i);
            }
            
            if(groups[trackGroup][combo] == nums[i]){
                combo++;
                if(groups[trackGroup].length == combo){//found the subarray
                    trackGroup++;
                    combo = 0;
                    quickRestart.clear();
                    found++;
                }
            }else{
                combo = 0;
            }

            if(found == groups.length) return true;
            i++;

            if(!quickRestart.isEmpty() && i == nums.length){
                i = quickRestart.remove(0) + 1;
                combo = 1;
            }

        }

        return found == groups.length;
    }
    

}
