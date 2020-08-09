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
        Node n = this.head;
        if(n == null){
            head = new Node(data);
        }
        
        while (n.next != null){
            n = n.next;
        }
        n.next = new Node(data);
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

        n=null;
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
        if (this.head.next == null){//if head is also tail
            this.head = null;
            return;
        }
        
        Node n = this.head.next;
        Node prev = this.head;

        while(n.next != null){
            n = n.next;
            prev = prev.next;
        }
        prev.next = null;
        return;
    }

    public void removeDuplicates(){
        HashSet<Integer> set = new HashSet<Integer>();
        Node n = this.head;

        while(n.next != null){
            if(set.contains(n.data)){
                remove(n);
            }else{
                set.add(n.data);
                n = n.next;
            }
        }
        if(set.contains(n.data)){//tail is special
            remove(n);
        }
        return;
    }

    public void reverse(){
        Node n = this.head;
        Node prev = null;
        while(n != null){
            Node current = n;
            n = n.next;    

            current.next = prev;
            prev = current;
            this.head = current;
        }
    }


    public void print(){
        Node n = this.head;
        if(n == null){
            System.out.println("Empty List");
            return;
        }

        while(n != null){
            System.out.print( n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

}