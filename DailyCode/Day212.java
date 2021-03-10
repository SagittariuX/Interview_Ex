public class Day212{

    public static void main(String[] args) {
        

        System.out.println(numToColumn(702));


    }


    private static String numToColumn(int n){
        StringBuilder sb = new StringBuilder();

        while(n > 0){

            int remin = n % 26;

            if(remin == 0){
                sb.append('Z');
                n = n / 26 - 1;
            }else{
                sb.append((char)('A' + remin - 1));
                n /= 26;
            }

        }

        return sb.reverse().toString();
    }


}