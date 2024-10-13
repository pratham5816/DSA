package javaDSAfreeCodeCamp.QuickSort;

public class qs {
                   
    public void QuickSort(int[] arr , int low , int high){
        if(low < high){
            int p = partition(arr, low, high);
            QuickSort(arr, low, p -1);
            QuickSort(arr, p + 1, high);
        }
    
    }

    public int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int i = low;
        int j = low;
        while(i <= high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j - 1;                     
    }


    }
