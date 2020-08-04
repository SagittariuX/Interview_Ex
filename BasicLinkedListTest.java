import LinkedList.*;

public class BasicLinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
       
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
    
        list.print();

        list.add(2);
        list.add(6);
        list.add(6);
        list.add(6);

        list.removeDuplicates();
        list.print();



    }
}