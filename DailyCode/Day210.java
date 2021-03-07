public class Day210 {
    public static void main(String[] args) {
        
        collatzSeq(100);

    }

    private static void collatzSeq(int n){

        System.out.println(n);

        while(n > 1){

            if(n % 2 == 0){
                n /= 2;
                System.out.println(n);
            }else{
                n = 3*n + 1;
                System.out.println(n);
            }

        }

    }

}
