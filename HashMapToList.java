import java.util.HashMap;
import java.util.stream.*;
import java.util.Arrays;

public class HashMapToList {
    public static void main(String[] args) {
        
        HashMap <String,Integer> map = new HashMap<>();
        int[] nums = {0,0,1,2,3,5,1,3,2,4,6,6,};

        Arrays.stream(nums).forEach(n -> map.put(n+"", map.getOrDefault(n+"", 0) + 1));

        System.out.println(map.toString());

        // int[] newList = Arrays.stream(nums)
        //                 .map(n -> n+1)  
        //                 .filter(n -> n > 5)
        //                 .toArray();

        // System.out.println(Arrays.toString(newList));

        nums = Arrays.stream(nums)
                    .boxed()
                    .sorted((a,b) -> map.get(a+"") != map.get(b+"") ? map.get(a+"") - map.get(b+"") : b - a )
                    .mapToInt(n -> n)
                    .toArray();
        
        System.out.println(Arrays.toString(nums));
    }
}
