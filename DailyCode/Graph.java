import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph<T>{

    private HashMap<T, ArrayList<T>> map ;//actual graph
    private  HashSet<T> visited;//keep track which places have already been visited

    public Graph(){
        this.map = new HashMap<>();
    }

    public void addVertex(T v){
        if (map.containsKey(v)) return;

        map.put(v, new ArrayList<T>());
    }

    public void addEdge(T v, T u, boolean bidirectional){

        if(!map.containsKey(v)){
            this.addVertex(v);
        }

        if(bidirectional){
            this.addEdge(u, v, false);
        }

        this.map.get(v).add(u);
    }

    public int countVertex(){

        return map.keySet().size();
    }

    public int countEdges(){

        int count = 0;

        for(T key: map.keySet()){
            count += map.get(key).size();
        }

        return count;
    }

    public boolean hasVertex(T v){
        
        return map.containsKey(v);
    }

    public boolean hasEdge(T v, T u){

        if(!map.containsKey(v) || !map.containsKey(u)) return false;

        return map.get(v).contains(u);

    }

    public boolean removeEdge(T v, T u){

        if (!map.containsKey(v) || !map.containsKey(u)) return false;

        if (!map.get(v).contains(u)){
            return false;
        } else{ 
            map.get(v).remove(u);
            return true;
        }
    }



    
    public void depthFirstSearch(T start) throws Exception{

        if(map.isEmpty()) throw new Exception("Search on empty graph");

        if(!map.containsKey(start)) throw new Exception("Searching on non existent node");

        visited = new HashSet<T>();
        depthFirstSearchHelper(start);
        
    }

    public void depthFirstSearchHelper(T start){
        visited.add(start);
        System.out.println(start);
        for(T value: map.get(start)){
            if(!visited.contains(value)){
                depthFirstSearchHelper(value);
                
            }            
        }
    }



    public void printListView(){
        StringBuilder builder = new StringBuilder();

        for(T key : map.keySet()){
            builder.append(key.toString() + ": ");
            for(T value: map.get(key)){
                builder.append(value.toString() + " ");
            }
            builder.append('\n');
        }
        System.out.println(builder.toString());
    }


    public static void main(String[] args) {

        Graph<Integer> g = new Graph<Integer>();

        g.addEdge(0, 1, true); 
        g.addEdge(0, 4, true); 
        g.addEdge(1, 2, true); 
        g.addEdge(1, 3, true); 
        g.addEdge(1, 4, true); 
        g.addEdge(2, 3, true); 
        g.addEdge(3, 4, true); 

        g.removeEdge(0, 1);

        g.printListView();
        try{
            g.depthFirstSearch(0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}


