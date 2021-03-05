public class Day201 {
    public static void main(String[] args) {
        
        int[][] triangle = {
            {1},
            {4,8},
            {1,5,3}
        };


        System.out.println(bestPath(triangle));
    }

    private static int bestPath(int[][] triangle){

        for(int i = triangle.length - 1 ; i > 0 ; i--){

            for(int j = triangle[i].length - 1; j > 0; j--){

                if(triangle[i][j] > triangle[i][j-1]){
                    triangle[i-1][j-1] += triangle[i][j];
                }else{
                    triangle[i-1][j-1] += triangle[i][j-1];
                }

            }
        }

        return triangle[0][0];
    }

}
