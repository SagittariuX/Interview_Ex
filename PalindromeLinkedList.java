import LinkedList.LinkedList;
import LinkedList.Node;
import java.util.Stack;

public class PalindromeLinkedList  {
    
    private static boolean isPalindrome(LinkedList list){
        Node n = list.head;
        Node fast = list.head;
        Stack<Integer> stack = new Stack<Integer>();

        while (fast != null && fast.next != null){//load first half
            stack.push(n.data);
            n = n.next;
            fast = fast.next.next;
        }
        if(fast != null){//odd 
            n = n.next;
        }
        while(n != null){
            if(n.data != stack.pop()){
                return false;
            }
            n = n.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        //list.add(2);
        
        list.print();
        System.out.println(isPalindrome(list));

    }
}