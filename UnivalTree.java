
import BinaryTree.*;

// A unival tree (which stands for "universal value") is a tree 
// where all nodes under it have the same value.

// Given the root to a binary tree, count the number of unival subtrees.



public class UnivalTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(0);
        tree.root.left = new Node(1);
        tree.root.right = new Node(0);
        tree.root.right.left = new Node(1);
        tree.root.right.left.left = new Node(1);
        tree.root.right.left.right = new Node(1);
        tree.root.right.right = new Node(0);

       univalTrees(tree);
    }

    private static int univalTrees(BinaryTree tree){
        int count = 0;
        univalTreeHelper(tree.root, tree.root.data, count);

        return count;
    }

    //Need to remind myself to implement a pair in java for this to
    //actually return a int

    private static boolean univalTreeHelper(Node n, int prevValue, int count){
        if(n == null){//reaches the end
            return true;
        }
       // System.out.print(n.data);
        if (n.left == null && n.right == null){//reaches a leaf
            return (n.data == prevValue) ? true : false;
        }else{
            boolean leftBool = univalTreeHelper(n.left, n.data, count);
            boolean rightBool = univalTreeHelper(n.right, n.data, count);
            if(leftBool && rightBool){
                System.out.println(1);
            }
            return (n.data == prevValue) ? true : false;
        }
    }
    
}