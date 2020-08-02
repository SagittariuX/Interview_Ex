package LinkedList;

public class LinkedList {
    public Node head;

    public LinkedList(){
        this.head = null;
    }
    public LinkedList(int data){
        this.head = new Node(data);
    }
    
    public void add(int data){
        Node tracker = this.head;
        if(tracker == null){
            head = new Node(data);
        }
        
        while (tracker.next != null){
            tracker = tracker.next;
        }
        tracker.next = new Node(data);
    }

    public void print(){
        Node tracker = this.head;
        if(tracker == null){
            System.out.println("Empty List");
            return;
        }

        while(tracker != null){
            System.out.print( tracker.data+" ");
            tracker = tracker.next;
        }
        System.out.println();
    }

}