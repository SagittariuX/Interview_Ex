import java.util.Arrays;

public class MergeStringAlt {
    // https://leetcode.com/problems/merge-strings-alternately/
    public static void main(String[] args) {
        
        String s1 = "abc";
        String s2 = "wxyz";

        System.out.println(merge(s1,s2));

    }

    private static String merge(String s1, String s2){

        char[] merged = new char[s1.length()+s2.length()];
        int index = 0;
        int mergedIndex = 0;
        while(index < s1.length() && index < s2.length()){

            merged[mergedIndex++] = s1.charAt(index);
            merged[mergedIndex++] = s2.charAt(index);
            index += 1;
        }

        for(int i = index ; i < s1.length(); i++){
            merged[mergedIndex++] = s1.charAt(i);
        }
        for(int i = index ; i < s2.length(); i++){
            merged[mergedIndex++] = s2.charAt(i);
        }

        return new String(merged);
    }

}
