import Queue.Queue;
import Queue.StackQueue;

public class BasicQueueTest {
    public static void main(String[] args) {


        //testing normal queue
        Queue<Integer> queue = new Queue<Integer>(1);
        queue.add(2);
        queue.add(3);
        queue.print();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.print();
        
        //testing stack queu
        StackQueue<Integer> stackqueue = new StackQueue<Integer>(1);
        stackqueue.add(1);
        stackqueue.add(2);
        stackqueue.add(3);
        System.out.println(stackqueue.peek());

    }
}