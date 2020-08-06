package Queue;
import Stack.Stack;


//Making a queue with 2 stacks
public class StackQueue<T> {
    
    Stack<T> oldStack;
    Stack<T> newStack;

    public StackQueue(){
        oldStack = new Stack<T>();
        newStack = new Stack<T>();
    }
    public StackQueue(T data){
        oldStack = new Stack<T>();
        newStack = new Stack<T>(data);
    }

    private void switchStack(){
        if(oldStack.isEmpty()){ //need to have this otherwise the order gets messed up
            while(!newStack.isEmpty()){
                oldStack.push(newStack.pop());
            }
        }
    }

    public void add(T data){ //always add to new stack
        newStack.push(data);
    }

    public T peek(){
        switchStack();
        return oldStack.peek();
    }

    public T remove(){
        switchStack();
        return oldStack.pop();
    }

}