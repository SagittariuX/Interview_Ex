public class LongestPalindromeSubstring {
    // https://leetcode.com/problems/longest-palindromic-substring/

    public static void main(String[] args) {
        
        String s = "babad";

        System.out.println(longestSubstring(s));

    }


    private static int mostLeft = 0;
    private static int mostRight = 0;

    private static String longestSubstring(String s){

        int len = s.length();
        if (len == 1) return s;

        for(int i = 0 ; i < len-1; i++){

            extendSubstring(s, i, i);
            extendSubstring(s, i, i+1);
            
        }
        
        return s.substring(mostLeft, mostRight);
    }


    private static void extendSubstring(String s, int left, int right){
        int len = s.length();
        
        if(s.charAt(left) != s.charAt(right)) return;

        while(left >= 0 && right < len && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        int current = right - left + 1;
        if(current > mostRight - mostLeft){
            mostLeft = left + 1;
            mostRight = right -1 ;
        }

        // System.out.println(mostLeft + " " + mostRight);

    }

}
