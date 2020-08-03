import LinkedList.*;

public class BasicLinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //1 2 3 4 5 
        list.print();
        //System.out.println(list.get(0).data);
        list.remove(3);
        //1 2 3 5
        list.print();

        // list.add(2);
        // list.add(6);
        // list.add(6);

        // list.removeDuplicates();
        // //1 2 3 5 6
        // list.print();



    }
}