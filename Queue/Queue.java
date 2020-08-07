package Queue;

public class Queue<T> {

    public static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

        public T returnData(){
            return this.data;
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
        Node<T> node = new Node<T>(data);
        if(this.bottom != null){
            this.bottom.next = node;
        }
        this.bottom = node;
        if(this.top == null){
            this.top = this.bottom;
        }
        return;
    }

    public void add(Node<T> node){
        if(this.bottom != null){
            this.bottom.next = node;
        }
        this.bottom = node;
        if(this.top == null){
            this.top = this.bottom;
        }
        return;
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

    public Node<T> removeNode(){
        if(top == null){
            return null;
        }
        Node<T> value = this.top;
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