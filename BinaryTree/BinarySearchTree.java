package BinaryTree;

class BinarySearchTree extends BinaryTree{
    
    public BinarySearchTree(){
        super();
    }

    public BinarySearchTree(int data){
        super(data);
    }

    public void add(int data){
        this.root.right = new Node(data);
    }

}