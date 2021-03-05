public class Day206 {
    public static void main(String[] args) {
        
        int[] map = {2,1,0,3,5,4};
        char[] list = {'z', 'b', 'c', 'd', 'e', 'f'};

        System.out.println(mixUp(map, list));
        System.out.println(list);

    }


    //assuming map and list are same size
    //assuming all values given in map are valid
    //Time: O(n) Space O(1)
    private static char[] mixUp(int[] map, char[] list){

        int index = 0;
        for(int swapIndex : map){
            
            if(swapIndex == index || swapIndex == -1) {
                index++;
                continue;
            }

            
            char temp = list[index];
            
            list[index] = list[swapIndex];
            list[swapIndex] = temp;

            map[swapIndex] = -1;

            index ++;
        }
        return list;
    }
}
