import LinkedList.LinkedList;
import LinkedList.Node;

public class SumBasicLinkedList {
    

    //Input two linkedlists representing the reverse a int
    //return the sum of the numbers Ex.
    // L1 : 2 -> 3 -> 6     L2 : 3 -> 6 -> 9
    // 632 + 963
    // return:  1595
    private static int sumLists(LinkedList l1, LinkedList l2){
        if(l1.head == null && l2.head == null) {return 0;}

        int sum = 0;
        int carry = 0; 
        int multiple = 1;
        int tempsum ;

        Node n1 = l1.head;
        Node n2 = l2.head;

        while(n1 != null && n2 != null){

            tempsum = n1.data + n2.data + carry;
            carry = tempsum/10;
            tempsum = tempsum%10;

            sum += tempsum * multiple;
            multiple *= 10;

            n1 = n1.next;
            n2 = n2.next;
        }
        if(n1 != null){
            while(n1 != null){
                tempsum = n1.data + carry;
                carry = tempsum/10;

                sum += tempsum * multiple;
                multiple *= 10;

                n1 = n1.next;
            }
        }else if (n2 != null){
            while(n2 != null){
                tempsum = n2.data + carry;
                carry = tempsum/10;

                sum += tempsum * multiple;
                multiple *= 10;

                n2 = n2.next;
            }
        }else{
            sum += carry * multiple;
        }
        return sum;
    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList(2);
        l1.add(3);
        l1.add(6);

        LinkedList l2 = new LinkedList(3);
        l2.add(6);
        l2.add(9);
        l2.add(9);

        //1595
        System.out.println(sumLists(l1, l2));        
    }
}