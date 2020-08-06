package Stack;

public class MinStack extends Stack<Integer>{

    Stack<Integer> minStack ;

    public MinStack (int data){
        super(data);
        minStack = new Stack<Integer>(data);
    }
    public MinStack (){
        super();
        minStack = new Stack<Integer>();
    }

    public void push(int data){
        super.push(data);
        if(minStack.peek() == null){
            minStack.push(data);
        }
        else if (minStack.peek() >= data){
            minStack.push(data);
        }
    }

    public Integer pop(){
        int value = super.pop();
        if(value == this.min()){
            minStack.pop();
        }
        return value;
    }

    public int min(){
        return minStack.peek();
    }

    public void printBoth(){
        System.out.println("super: ");
        super.print();
        System.out.println("min:  ");
        minStack.print();
        return;
    }

}