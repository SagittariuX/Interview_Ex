public class HelperSquareToFancyBrackets {
    
    public String SquareToBraceBrackets (String s){
        char[] arr = s.toCharArray();
        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '['){
                arr[i] = '{';

            }
            else if(s.charAt(i) == ']'){
                arr[i] = '}';
            }


        }
        return new String(arr);

    }
}
