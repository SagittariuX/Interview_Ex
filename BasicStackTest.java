import Stack.Stack;

public class BasicStackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(1);
        stack.push(2);
        stack.push(3);

        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(1);
        stack.print();
    }
}