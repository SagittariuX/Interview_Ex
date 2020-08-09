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
        if(list.elementAt(0) == -1){
            return -1; //empty list
        }

        int size = 1;
        while(list.elementAt(size) != -1 && list.elementAt(size) < target){
            size *= 2;
        }

        return binarySearch(list, target, size/2, size);
    }


    private int binarySearch(Listy list, int target, int low, int high){
        int mid;
        while (low <= high){
            mid = (low + high)/2;
            if(list.elementAt(mid) >  target || list.elementAt(mid) == -1){ //look left
                high = mid - 1;
            }
            else if(list.elementAt(mid) < target){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }


}