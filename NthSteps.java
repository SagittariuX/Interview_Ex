import java.util.Arrays;

public class NthSteps {
    
    public static void main(String[] args) {
        
        System.out.println(countWays(3));
    }

    private static int countWays (int n){

        int[] mem = new int[n+1];
        Arrays.fill(mem, -1);
        return countWays(n,mem);
    }

    private static int countWays (int n, int[] mem){

        if (n < 0){
            return 0;
        }
        else if(n == 0){
            return 1;
        }
        else if(mem[n] > -1){
            return mem[n];
        }
        else{
            mem[n] = countWays(n-1,mem) + countWays(n-2,mem) + countWays(n-3, mem);

            return mem[n];
        }
    }
}
