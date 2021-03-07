public class UniquePath {
    // https://leetcode.com/problems/unique-paths/
    public static void main(String[] args) {
        
        int x = 3;
        int y = 3;

        System.out.println(paths(x, y));

    }

    private static int paths(int x , int y){

        if(x == 1 && y == 1) return 1;

        int[][] map = new int[x][y];

        //first setup top and left edges
        for(int i = 1; i < y; i++){
            map[0][i] = 1;
        }
        for(int i = 1; i < x; i++){
            map[i][0] = 1;
        }

        for(int currX = 1; currX < x; currX++){
            for(int currY = 1; currY < y; currY++){

                map[currX][currY] = map[currX-1][currY] + map[currX][currY-1];

            }
        }

        return map[x-1][y-1];
    }


}
