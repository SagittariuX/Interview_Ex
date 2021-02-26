
public class Day2 {
    
    public static void main(String[] args) {
        Node<Integer> tree = new Node<Integer>(0);

        tree.left = new Node<Integer>(1);
        tree.right = new Node<Integer>(0);
        tree.right.right = new Node<Integer>(0);
        
        tree.right.left = new Node<Integer>(1);
        tree.right.left.left = new Node<Integer>(1);
        tree.right.left.right = new Node<Integer>(1);


        System.out.println(sumOfTree(tree));
    }


    private static int sumOfTree (Node n){

        if (n == null){
            return 0;
        }

        int left = sumOfTree(n.left);
        int right = sumOfTree(n.right);

        return left + right + n.value;
    }

}
