public class Day199 {
    
    public static void main(String[] args) {
        
        String s = "))())";

        System.out.println(finishBrackets(s));

    }

    private static String finishBrackets(String s){

        String ans = "";

        int openbracket = 0;

        for(char c : s.toCharArray()){
            
            if(c == '('){
                openbracket++;
                ans += c;
            }else{
                if (openbracket == 0){
                    ans += '(';
                }else{
                    openbracket--;
                    
                }
                ans += c;
            }
            
        }
        
        while(openbracket > 0){
            ans += ')';
            openbracket--;
        }

        return ans;

    }

}
