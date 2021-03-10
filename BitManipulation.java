public class BitManipulation {
    
    public static void main(String[] args) {
        
        int num = 4;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(num >> 3);
        System.out.println(num >>> 3);


        //To determine if a number is a power of two
        boolean isPowerOfTwo = (n & (n - 1)) == 0;



    }
}
