package Queue;

public class Queue<T> {

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;
    private Node<T> bottom;
    public Queue(T data){
        this.top = new Node<T>(data);
        this.bottom = top;
    }

    public Queue(){
        this.top = null;
        this.bottom = null;
    }

    public T peek(){
        if(top == null){
            return null;
        }
        return this.top.data;
    }

    public void add(T data){
        if(this.bottom != null){
            this.bottom.next = new Node<T>(data);
        }
        this.bottom = this.bottom.next;
        if(this.top == null){
            this.top = this.bottom;
        }
    }
    
    public T remove(){
        if(top == null){
            return null;
        }
        T value = this.top.data;
        this.top = this.top.next;
        if(this.top == null){
            this.bottom = null;
        }
        return value;
    }

    public boolean isEmpty(){
        return this.top == null;
    }

    public void print(){
        Node<T> n = this.top;
        while(n != null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
        return;
    }

}