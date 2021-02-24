public class BinaryUniqueChar {
    
    public static void main(String[] args) {
        
        String s = "abcc";

        System.out.println(isUnique(s));

        System.out.println(1 << 2 & 1 << 1); //just trying to see what each operation does
        
    }

    private static boolean isUnique(String s){

        int checker = 0;

        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i) - 'a';
            if ((checker & ( 1 << val )) > 0){
                return false;
            }
            // |= is read the same as +=
            // a |= b  is the same as a = a | b
            checker |= (1 << val);
        }

        return true;
    }

}
