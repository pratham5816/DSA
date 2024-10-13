package javaDSAfreeCodeCamp.InsertionSort;

public class InsertionSort {
    
    public void InsertionSort2 (int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = temp;
        }
    }
}
