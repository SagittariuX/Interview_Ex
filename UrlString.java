
import java.util.Arrays;

public class UrlString {
    
    public static void main(String[] args) {
        
        //goal is to add in '%20' in between the string when given the true length of the string
        //can assume that there is enough space to include the '%20'
        //can assume that this will not be empty
        //try to do this in place

        
        String s = "Mr John Smith                          ";
        char[] c = s.toCharArray();
        int truelength = 13;//"Mr John Smith" is 13 chars

        // 
        UrlString(c, truelength);
        System.out.println(c);
        
    }

    private static void UrlString(char[] str, int truelength){
        //determine how much room we need
        int index = 0;
        for(int i = 0 ; i < truelength; i++){
            index += (str[i] == ' ') ? 3 : 1;
        }
        str[index--] = '\0'; //end the string

        for(int i = truelength - 1 ; i >= 0 ; i--){
            if(str[i] == ' '){
                str[index--] = '0';
                str[index--] = '2';
                str[index--] = '%';
            }else{
                str[index--] = str[i];
            }
        }
    }

}
