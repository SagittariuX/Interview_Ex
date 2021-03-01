
public class Day8 {
    
    public static void main(String[] args) {
        
        Node<Integer> tree = new Node<Integer>(0);

        tree.left = new Node<Integer>(1);
        tree.right = new Node<Integer>(0);
        tree.right.right = new Node<Integer>(0);
        
        tree.right.left = new Node<Integer>(1);
        tree.right.left.left = new Node<Integer>(1);
        tree.right.left.right = new Node<Integer>(1);

        System.out.println(countUnivalSubtree(tree));
    }

    // a unival subtree is a tree where all node under it have the same value
    private static int countUnivalSubtree(Node<Integer> n){
        
        if (n == null){
            return 0;
        }

        int left = countUnivalSubtree(n.left);
        int right = countUnivalSubtree(n.right);

        if(isUni(n)){
            return left + right + 1;
        }else {
            return left + right;
        }
    }

    private static boolean isUni(Node<Integer> n){
        
        if(n == null){
            return true;
        }else{ 
            return checkValues(n) && isUni(n.left) && isUni(n.right);
        }
        
    }

    private static boolean checkValues(Node<Integer> n){
        
        boolean check = true;

        if(n.left != null){
            check &= n.value == n.left.value; 
        }

        if(n.right != null){
            check &= n.value == n.right.value;
        }
        
        return check;
    }



}

