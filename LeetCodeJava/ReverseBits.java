public class ReverseBits {
    // https://leetcode.com/problems/reverse-bits/
    public static void main(String[] args) {
        
        System.out.println(reverseBits(43261596));;
        
    }

    private static int reverseBits(int n){

        int ans = 0;

        for(int i = 0 ; i < 32 ; i++){

            if((n >>> i & 1) > 0){
                ans += 1 << (31-i);
            }

        }

        return ans;
    }


}
