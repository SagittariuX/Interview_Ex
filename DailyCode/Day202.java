import java.util.LinkedList;

public class Day202 {
    
    public static void main(String[] args) {
        
        int num = 12321;

        System.out.println(numIsPalindrome(num));
    }


    private static boolean numIsPalindrome(int n){

        if(n < 10) return true;

        LinkedList<Integer> list = new LinkedList<Integer>();
        
        int place = 0;

        while(n > 0){

            list.add(n % 10);
            n = n/10;
            place++;
        }

        for(int i = 0; i < place/2; i++){
            if(list.removeFirst() != list.removeLast()){
                return false;
            }
        }
        
        return true;
    }

}
