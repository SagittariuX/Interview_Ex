import java.util.*;


public class SortingTest {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(30);
        array.add(8);
        array.add(80);
        array.add(5);
        array.add(1);
        array.add(40);
        array.add(100);
        array.add(20);
        array.add(77);
        array.add(799);
        array.add(1);

        //array = insertionSort(array);
        //array = bubbleSort(array);
        //array = selectionSort(array);
        //array = radixSort(array);
        //array = mergeSort(array);
        array = quickSort(array);
        System.out.println(array.toString());
    }

    private static ArrayList<Integer> bubbleSort(ArrayList<Integer> array){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < array.size()-1; i++){
                if(array.get(i) > array.get(i+1)){
                    int temp = array.get(i);
                    array.set(i, array.get(i+1));
                    array.set(i+1, temp);
                    swapped = true;
                }
            }
        }
        return array;
    }

    private static ArrayList<Integer> insertionSort(ArrayList<Integer> array){
        for(int i = 0; i < array.size(); i++){
            int j = i;
            while(j > 0 && array.get(j-1) > array.get(j)){
                int temp = array.get(j-1);
                array.set(j-1, array.get(j));
                array.set(j, temp);

                j--;
            }
        }
        return array;
    }


    private static ArrayList<Integer> selectionSort(ArrayList<Integer> array){
        for(int i = 0 ; i < array.size() - 1; i++){
            int s = i;
            for(int j = i; j < array.size() - 1; j++){
                if(array.get(s) > array.get(j+1)){
                    s = j+1;
                }
            }
            if(s != i){
                int temp = array.get(s);
                array.set(s, array.get(i));
                array.set(i, temp);
            }
        }
        return array;
    }

    private static ArrayList<Integer> radixSort(ArrayList<Integer> array){
        int max = Collections.max(array);
        for(int exp = 1; max/exp > 0; exp *= 10){
            array = countSort(array, exp);
        }
        return array;
    }

    private static ArrayList<Integer> countSort(ArrayList<Integer> array, int exp){
        ArrayList<Integer> output = new ArrayList<Integer>(Collections.nCopies(array.size(), 0));
        int[] count = new int[10];
        Arrays.fill(count, 0);

        //counts the occurrences of each digit
        for(int i = 0; i < array.size(); i++){ 
            count[ (array.get(i)/exp)%10 ]++;           
        }

        //Staggers the occurences and reserves spots so we can put it into ArrayList output
        for(int i = 1; i < 10; i++){
            count[i] += count[i-1];
        }

        for(int i = array.size()-1; i >= 0; i--){
            output.set( count[ (array.get(i)/exp)%10 ]-1, array.get(i));
            count[ (array.get(i)/exp)%10 ]--;
        }

        return output;
    }

    private static ArrayList<Integer> mergeSort(ArrayList<Integer> array){

        mergeSort(array, 0, array.size()-1);

        return array;
    }

    private static void mergeSort(ArrayList<Integer>array, int l, int r){
        
        if(l < r){
            int m = (l + r)/2;

            mergeSort(array, l, m);
            mergeSort(array, m+1, r);

            merge(array, l, m, r);
        }
    }

    private static void merge(ArrayList<Integer>array, int l, int m ,int r){
        
        int leftSize = m - l + 1;
        int rightSize = r - m;


        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        
        for(int i = 0; i < leftSize; i++){
            left[i] = array.get(l + i);
        }
        for(int i = 0; i < rightSize; i++){
            right[i] = array.get(m + i + 1);
        }

        int leftCount = 0;
        int rightCount = 0;
        int[] combined = new int[leftSize + rightSize];

        while(leftCount < leftSize && rightCount < rightSize){
            if(left[leftCount] < right[rightCount]){
                combined[leftCount + rightCount] = left[leftCount];
                leftCount++;
            }else{
                combined[leftCount + rightCount] = right[rightCount];
                rightCount++;
            }
        }

        while(leftCount < leftSize){//copy leftover
            combined[leftCount + rightCount] = left[leftCount];
            leftCount++;
        }
        while(rightCount < rightSize){//copy leftover
            combined[leftCount + rightCount] = right[rightCount];
            rightCount++;
        }

        for(int i = 0; i < leftSize + rightSize; i++){
            array.set( l + i ,combined[i]);
        }

    }

    private static ArrayList<Integer> quickSort(ArrayList<Integer>array){
         
        return quickSort(array, 0 , array.size()-1);
    }

    private static ArrayList<Integer> quickSort(ArrayList<Integer>array, int l, int r){
        if(l < r){

            int p = partition(array, l, r);

            quickSort(array, l , p - 1);
            quickSort(array, p + 1, r);
        }

        return array;
    }

    private static int partition(ArrayList<Integer>array, int l, int r){

        int pivot  = array.get(r);
        int i = l - 1;

        for(int j = l; j <= r-1 ; j++){
            if(array.get(j) < pivot){
                i++;
                int temp = array.get(j);
                array.set(j , array.get(i));
                array.set(i , temp);
            }
        }
        int temp = array.get(r);
        array.set(r , array.get(i+1));
        array.set(i+1 , temp);
        return i+1;
        
    }




}