public class CountBits {
    // https://leetcode.com/problems/number-of-1-bits/
    
    private int hammingWeight(int n) {
        
        int count = 0;
        
        for(int i = 0; i < 32; i++) count += (n >> i & 1);
        
        return count;
        
    }

}
