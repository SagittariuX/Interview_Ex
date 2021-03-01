public class Day94 {
    
    public static void main(String[] args) {

        Node<Integer> node = new Node<Integer>(10); 
        
        node.left = new Node<Integer>(2); 
        node.right = new Node<Integer>(10); 
        node.left.left = new Node<Integer>(20); 
        node.left.right = new Node<Integer>(1); 
        node.right.right = new Node<Integer>(-25); 
        node.right.right.left = new Node<Integer>(3); 
        node.right.right.right = new Node<Integer>(4);
    
        System.out.println(maxPath(node));
    }

    private static int max = Integer.MIN_VALUE;
    private static int maxPath(Node<Integer> n){
        
        int ans = maxPathHelper(n);
        return Math.max(max, ans);

    }

    private static int maxPathHelper (Node<Integer> n){

        if (n == null){
            return 0;
        }

        int val = n.value;
        int left = maxPathHelper(n.left);
        int right = maxPathHelper(n.right);

        int valLeft = Math.max(val, val + left);
        int valRight = Math.max(val, val + right);
        int valBoth = Math.max(val, val + right + left);
        val = Math.max(valLeft, valRight);
        val = Math.max(valBoth, val);
        max = Math.max(val, max);
        max = Math.max(valBoth, max);
        return val;
    }


}
