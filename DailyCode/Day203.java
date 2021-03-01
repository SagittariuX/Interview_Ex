
public class Day203 {
    public static void main(String[] args) {
         //driver code
         //this tree is guaranteed to be complete
        Node<Integer> root = new Node<Integer>(1);
        root.left = new Node<Integer>(2);
        root.left.left = new Node<Integer>(4);
        root.left.right = new Node<Integer>(5);

        root.right = new Node<Integer>(3);
        root.right.left = new Node<Integer>(6);
        
        System.out.println(countNodes(root));
    }

    private static int getHeight(Node<Integer> node){
        return (node == null) ? -1 : 1 + getHeight(node.left) ;
    }

    private static int countNodes(Node<Integer> node){
        int h = getHeight(node);

        if (h < 0) return 0;

        if (h-1 == getHeight(node.right)) {

            return (1 << h) + countNodes(node.right);
        }else{

            return (1 << h-1) + countNodes(node.left);
        }
        
    }



}
