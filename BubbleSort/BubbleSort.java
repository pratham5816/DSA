package javaDSAfreeCodeCamp.BubbleSort;

public class BubbleSort {

    public void BubbleSortx(int[] arr , int n){
        
        for(int i = 0; i < n - 1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false) break;
        }
    }

    public void PrintArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arrr = new int[] {5,1,2,9,10};
        BubbleSort bs = new BubbleSort();
        bs.PrintArr(arrr);
        bs.BubbleSortx(arrr, 5);
        System.out.println();
        bs.PrintArr(arrr);
    }

}
