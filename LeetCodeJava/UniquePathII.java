import java.util.Arrays;

public class UniquePathII {
    public static void main(String[] args) {
        
        int[][] map = {{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{1,0},{0,0},{0,0},{0,0},{0,0},{0,0},{1,0},{0,0},{0,0},{0,0},{0,0},{0,1},{0,0},{0,0},{1,0},{0,0},{0,0},{0,1},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,1},{0,0},{0,0},{0,0},{0,0},{1,0},{0,0},{0,0},{0,0},{0,0}};

        System.out.println(paths(map));
        // System.out.println(Arrays.deepToString(map));

    }

    private static int paths(int[][] map){

        int y = map.length;
        int x = map[0].length;
        if(map[y-1][x-1] == 1  || map[0][0] == 1) return 0;
        if(x == 1 && y == 1) return 1;
        

        //first setup top and left edges
        boolean notBlocked = true;
        for(int i = 1; i < x; i++){
            if(map[0][i] == 1){
                map[0][i] = -1;
                notBlocked = false;
            }

            if(notBlocked) map[0][i] = 1;
        }
        notBlocked = true;
        for(int i = 1; i < y; i++){
            if(map[i][0] == 1){
                map[i][0] = -1;
                notBlocked = false;
            }
            if(notBlocked) map[i][0] = 1;
        }

        for(int currY = 1; currY < y; currY++){
            for(int currX = 1; currX < x; currX++){
                
                if(map[currY][currX] == 1){
                    map[currY][currX] = -1;
                    continue;
                }
                int prevTop = (map[currY-1][currX] == -1) ? 0 : map[currY-1][currX];
                int prevLeft = (map[currY][currX-1] == -1) ? 0 : map[currY][currX-1];

                map[currY][currX] = prevTop + prevLeft;
            }
        }

        return map[y-1][x-1];

    }

}
