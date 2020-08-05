package Stack;

public class Stack<T> {
    
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top;
    public Stack(T data){
        this.top = new Node<T>(data);
    }
    public Stack(){
        this.top = null;
    }

    public void push(T data){
        if(this.top == null){
            this.top = new Node<T>(data);
            return;
        }
        Node<T> n = this.top;
        while(n.next != null){
            n = n.next;
        }
        n.next = new Node<T>(data);
        return;
    }
    
    public T peek(){
        if(this.top == null){
            return null;
        }
        return this.top.data;
    }

    public T pop(){
        if(this.top == null){
            return null;
        }
        T n = this.top.data;
        this.top = this.top.next;
        return n;
    }

    public void print(){
        Node<T> n = this.top;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
        return;
    }




}