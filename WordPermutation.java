public class WordPermutation {
    public static void main(String[] args) {
        
        
        String a = "abcdbbbbbbbbb";
        String b = "abcdbbbbbbbb";


        System.out.println(isPermutation(a, b));

    }


    private static boolean isPermutation(String a, String b){
        //assuming 128 chars ASCII
        if (a.length() != b.length()) return false;

        int[] count = new int[128];
        //now we count the appearances of chars in first word
        for (char c : a.toCharArray()){
            count[c]++ ;
        }

        //check if second string has the same number of char appearances
        for (char c : b.toCharArray()){
            if (count[c] == 0){
                return false;
            }
            count[c]-- ;
        }

        return true;
    }
}