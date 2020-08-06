import Stack.MinStack;

public class MinStackTest {
    public static void main(String[] args) {
        MinStack stack = new MinStack(3);
        stack.push(5);
        stack.push(1);
        stack.push(20);
        stack.push(50);
        stack.printBoth();


        stack.pop();
        stack.pop();
        stack.pop();
        stack.printBoth();
    }
}