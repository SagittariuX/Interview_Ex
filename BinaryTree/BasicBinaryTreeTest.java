package BinaryTree;

public class BasicBinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

       // tree.breadthFirstDisplay();
        tree.prettyPrint();

        tree.add(7);
        tree.add(6);
        tree.add(15);

      //  tree.breadthFirstDisplay();
        tree.prettyPrint();
        System.out.println(7/2);

    }
}