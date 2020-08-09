public class BlindSearch {
    /*
    Prompt: You are given an array-like data structure Listy which lacks a size
    method. It does, however, have an elementAt(i) method that returns the element at index i in
    0(1) time. If i is beyond the bounds of the data structure, it returns -1. (For this reason, the data
    structure only supports positive integers.) Given a Listy which contains sorted, positive integers,
    find the index at which an element x occurs. If x occurs multiple times, you may return any index.

    NOTE: this code does not actually run it's just an answer to this question
    */

    private int blindSearch(Listy list, int target){
        int i = 0, j = 0;

        if(list.elementAt(i) == -1){
            return -1; //empty list
        }

        while(list.elementAt(i) != -1 || list.elementAt(j) != -1){
            if(list.elementAt(i) == target){//found item with slow tracker
                return i;
            }
            if(list.elementAt(j) == target){//found item with fast tracker
                return j;
            }

            //since target is still larger than where fast tracker is
            //we can speed up the slow tracker
            if(list.elemntAt(j) < target && list.elementAt(j) != -1){
                i = j;
            }
            i += 1;
            j += 2;
        }

        return -1;
    }


}