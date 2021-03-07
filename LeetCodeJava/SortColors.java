import java.util.Arrays;

public class SortColors {

    // https://leetcode.com/problems/sort-colors/
    public static void main(String[] args) {
        
        int[] colors = {2,0,2,1,1,0};

        sort(colors);
        System.out.println(Arrays.toString(colors));
    }

    private static void sort(int[] colors){

        int white = 0;
        int red = 0;
        int blue = 0; 

        for (int i = 0; i < colors.length; i++){

            if(colors[i] == 0){//Found white move everything 1 step

                colors[blue++] = 2;
                colors[red++] = 1;
                colors[white++] = 0;
                

            }
            else if(colors[i] == 1){//Found red move red and blue 1 step
                colors[blue++] = 2;
                colors[red++] = 1;
            }
            else{ // Found blue only move blue forwards
                colors[blue++] = 2;
            }


        }



    }

}
