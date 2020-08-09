
import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {
        
        //Prompt: https://leetcode.com/problems/longest-substring-without-repeating-characters/
        
        
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";

        System.out.println(maxSubstring(str1));
        System.out.println(maxSubstring(str2));
        System.out.println(maxSubstring(str3));

    }
    //Time O(n) Space O(n)
    private static int maxSubstring(String s){
        if(s.isEmpty()) return 0;

        int i = 0;
        int max = 0;
        int current = 0;
        HashSet<Character> charSet = new HashSet<Character>();

        while(i < s.length()){
            if(charSet.contains(s.charAt(i))){
                charSet.clear();
                if(current > max){
                    max = current;
                }
                current = 0;

            }else{
                charSet.add(s.charAt(i));
                current++;
                i++;
            }
        }
        max = Math.max(current, max);

        return max;
    }
    
    


}