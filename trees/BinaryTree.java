import java.util.*;

public class BinaryTree{
    Node root;
    public BinaryTree(){
        this.root = null;
    }
    public BinaryTree(int data){
        this.root = new Node(data);
    }

    public void breadthFirstDisplay(){
        if(this.root == null){
            System.out.print("Root is null");
            return;
        }
        LinkedList<Node> list = new LinkedList<Node>(); 
        list.add(this.root);
        while(!list.isEmpty()){
            Node temp = list.getFirst();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                list.add(temp.left);
            }
            if(temp.right != null){
                list.add(temp.right);
            }
            list.remove();
        }
        System.out.println();

    }

    public void add(int data){
        if(this.root == null){
            this.root = new Node(data);
            return;
        }
        LinkedList<Node> list = new LinkedList<Node>(); 
        list.add(this.root);
        while(!list.isEmpty()){
            if(list.getFirst().left == null){
                list.getFirst().left = new Node(data);
                return;
            }
            else{
                list.add(list.getFirst().left);
            }

            if(list.getFirst().right == null){
                list.getFirst().right = new Node(data);
                return;
            }
            else{
                list.add(list.getFirst().right);
            }
            list.remove();
        }
    }

    

}