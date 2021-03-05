
public class BinaryPermutationCheck {
    //Checks if a given string is a permutation of a palindrome

    public static void main(String[] args) {
        
        String s = "hhaa";

        System.out.println(PermutationCheck(s));
    }

    private static boolean PermutationCheck(String s){

        int checker = 0;

        for(char c: s.toCharArray()){

            int current = 1 << (c - 'a');

            checker = checkLetter(checker, current);

        }


        return (checker == 0) || onlyOneToggle(checker);
    }

    private static int checkLetter(int checker, int current){

        if (current < 0) return checker;

        if ( (checker & current) > 0 ){ // toggle a 1 to 0

            return checker &= ~current;

        }else{ //toggle a 0 to 1

            return checker |= current;
        }
    }


    private static boolean onlyOneToggle(int checker){

        int mask = checker - 1;
        return ((mask & checker) > 0) ? false: true;
        
    }

}
