package LinkedList;
import java.util.*;

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

    public void push(int data){
        Node n = new Node(data);
        n.next = this.head;
        this.head = n;
    }


    public Node get(int index){
        Node n = this.head;
        if(n == null){
            System.out.println("empty list");
            return null;
        }
        while( n != null && index > 0){
            n = n.next;
            index--;
        }
        if(index > 0){
            System.out.println("out of index");
        }

        return n;
    }

    //remove by reference
    public void remove(Node n){
        if(n == null){ //out of index or doesnt exist
            return;
        }else if (n.next == null){//remove tail
            removeTail();
            return;
        }
        if(n == this.head){//remove head
            this.head = this.head.next;
        }else{//everything else
            n.data = n.next.data;
            n.next = n.next.next;
        }
        return;
    }

    //remove by index
    public void remove(int index){
        if(head == null){
            System.out.println("empty list");
            return;
        }else if(index == 0){
            this.head = this.head.next;
            return;
        }

        Node n = this.head;
        Node prev = null;
        while( n != null && index > 0){
            prev = n;
            n = n.next;
            index--;
        }
        if(index > 0){
            System.out.println("out of index");
            return;
        }
        if(n.next == null){//delete tail
            prev.next = null;
        }else{
            n.data = n.next.data;
            n.next = n.next.next;
        }
        return;
    }

    private void removeTail(){
        Node n = this.head;
    }

    public void removeDuplicates(){
        HashSet<Integer> set = new HashSet<Integer>();
        Node n = this.head;

        while(n != null){
            if(set.contains(n.data)){
                this.remove(n);    
            }else{
                set.add(n.data);
            }
            n = n.next;
        }

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