public class SparseSearch {
    
    public static void main(String[] args) {
        
        String[] strings = {"at", "", "", "ball", "", "", "cat", "", "", "", "", "dog"}; 

        int index = searchStrings(strings, "at");
        System.out.println(index);
        
    }


    private static int searchStrings(String[] strings, String target){
        if(strings == null || target.isEmpty() || target == null){
            return -1;
        }
        return binarySearch(strings, target, 0, strings.length-1);
    }


    private static int binarySearch(String[] strings, String target, int low, int high){
        if(low > high) return -1;

        int mid = (low + high)/2;
        if(strings[mid].isEmpty()){
            int left = mid - 1;
            int right = mid + 1;
            while(true){
                if(left < low && right > high){
                    return -1;
                }else if(left >= low && !strings[left].isEmpty()){//look to the left
                    mid = left;
                    break;
                }else if(right <= high && !strings[right].isEmpty()){//look to the right
                    mid = right;
                    break;
                }
                left--;
                right++;
            }
        }
        if(target.equals(strings[mid])){//look to the left
            return mid;
        }else if(strings[mid].compareTo(target) < 0){//look to the right
            return binarySearch(strings, target, mid+1, high);
        }else{
            return binarySearch(strings, target, low, mid-1);
        }
    }

}