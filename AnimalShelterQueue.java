import Queue.Queue;
import Queue.Queue.Node;
import java.util.LinkedList;


public class AnimalShelterQueue {
    //Prompt:
    // An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
    // out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
    // or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
    // that type). They cannot select which specific animal they would like. Create the data structures to
    // maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
    // and dequeueCat. You may use the built-in Linked list data structure.

    private static Queue<String> dogQueue = new Queue<String>();
    private static Queue<String> catQueue = new Queue<String>();
    private static LinkedList<Node<String>> animalShelter = new LinkedList<Node<String>>();

    private static void enqueue(String data){
        Node<String> node = new Node<String>(data);
        if(data.substring(0,3).equals("dog")){
            
            dogQueue.add(node);
            animalShelter.add(node);
        }else if(data.substring(0, 3).equals("cat")){
            catQueue.add(node);
            animalShelter.add(node);
        }
        return;
    }

    private static String dequeueAny(){
        if(animalShelter.size() == 0){
            return "empty shelter";
        }

        Node<String> node = animalShelter.removeFirst();
        if(node.returnData().substring(0, 3).equals("dog")){
            dogQueue.remove();
        }else{
            catQueue.remove();
        }

        return node.returnData();
    }

    private static String dequeueCat(){
        if(catQueue.peek() == null){
            return "no cats";
        }
        Node<String> node = catQueue.removeNode();
        animalShelter.remove(node);
        return node.returnData();
    }

    private static String dequeueDog(){
        if(dogQueue.peek() == null){
            return "no dogs";
        }
        Node<String> node = dogQueue.removeNode();
        animalShelter.remove(node);
        return node.returnData();
    }   
    
    
    
    public static void main(String[] args) {
        enqueue("dog1");
        enqueue("dog2");
        enqueue("cat1");
        enqueue("cat2");
        enqueue("dog3");
        System.out.println(dequeueAny());
        System.out.println(dequeueAny());
        System.out.println(dequeueDog());
        System.out.println(dequeueAny());
        System.out.println(dequeueCat());
    }

}