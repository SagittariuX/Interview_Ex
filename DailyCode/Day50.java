

public class Day50 {
    
    public static void main(String[] args) {
        
        Node<String> tree = new Node<String>("*");

        tree.left = new Node<String>("+");
        tree.left.left = new Node<String>("3");
        tree.left.right = new Node<String>("2");

        tree.right = new Node<String>("+");
        tree.right.left = new Node<String>("4");
        tree.right.right = new Node<String>("5");


        System.out.println(calculateMyTree(tree));

    }

    private static int calculateMyTree(Node<String> n){

        //Found leaf
        if(n.left == null && n.right == null){
            return Integer.parseInt(n.value);
        }

        int left = calculateMyTree(n.left);
        int right = calculateMyTree(n.right);

        return customOperation(left, right, n.value);

    }


    private static int customOperation(int l, int r, String operation){

        switch(operation){
            case "+":
                return l + r;
            case "-":
                return l - r;
            case "*":
                return l * r;
            default:
                return l / r;
        } 

    }


}
