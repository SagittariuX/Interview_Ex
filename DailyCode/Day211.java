import java.util.ArrayList;

public class Day211 {
    
    public static void main(String[] args) {
        
        String s = "abracadabra";
        String p = "abr";

        System.out.println(patternSearch(s, p));

    }

    private static ArrayList<Integer> patternSearch(String s, String p){

        //assuming s & p  are always valid 
        ArrayList<Integer> indexes = new ArrayList<>(); 

        for(int i = 0 ; i < s.length() - p.length(); i++){

            if(s.substring(i, i + p.length()).equals(p)) indexes.add(i);


        }

        return indexes;
    }


}
