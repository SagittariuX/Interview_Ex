public class HelperSquareToFancyBrackets {
    public static void main(String[] args) {
        
        String s = "[[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[1,0],[0,0],[0,0],[0,0],[0,0],[0,0],[1,0],[0,0],[0,0],[0,0],[0,0],[0,1],[0,0],[0,0],[1,0],[0,0],[0,0],[0,1],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,1],[0,0],[0,0],[0,0],[0,0],[1,0],[0,0],[0,0],[0,0],[0,0]]";
        char[] arr = s.toCharArray();
        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '['){
                arr[i] = '{';

            }
            else if(s.charAt(i) == ']'){
                arr[i] = '}';
            }


        }

        System.out.println(new String (arr));

    }
}
