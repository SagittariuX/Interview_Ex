public class Dijkstras {
    
    public static void main(String[] args) {
        
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 


        search(graph, 5);
    }

    private static void search(int[][] graph, int start){

        int totalNodes = graph.length;
        int[] distance = new int[totalNodes];//keeps track of distance to each node

        boolean[] spt = new boolean[totalNodes];//keeps track of which nodes have already been visited

        for (int i = 0 ; i < totalNodes ; i++){

            distance[i] = Integer.MAX_VALUE;
            spt[i] = false;
        }

        distance[start] = 0;//initiate start

        for(int i = 0; i < totalNodes; i++){

            int min = minIndex(distance, spt);

            spt[min] = true;

            for(int j = 0; j < totalNodes; j++){

                if(!spt[j] && 
                    distance[min] != Integer.MAX_VALUE && 
                    graph[min][j] != 0 &&
                    distance[min] + graph[min][j] < distance[j]){

                    distance[j] = distance[min] + graph[min][j];

                }

            }

        }
        printSolution(distance);
        
    }

    private static int minIndex (int[] distance, boolean[] spt){

        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for(int i = 0; i < distance.length ; i++){

            if(spt[i] == false && distance[i] <= minDistance){
                minDistance = distance[i];
                minIndex = i;
            }

        }

        return minIndex;

    }

    private static void printSolution(int dist[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < dist.length; i++) 
            System.out.println(i + " \t\t " + dist[i]); 
    } 

}
