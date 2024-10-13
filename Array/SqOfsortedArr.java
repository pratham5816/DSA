package javaDSAfreeCodeCamp.Array;

public class SqOfsortedArr {
    public static void main(String[] args) {
        SqOfsortedArr x = new SqOfsortedArr();
        x.demo();
    }

    public void demo(){
        int[] arrr = new int[] {-4,-1,0,3,10};
        int[] r = sort(arrr);
        printArray(r);
    }
    public int[] sort(int[] arr){
        int[] result = new int[arr.length];
        int i = 0; int j = arr.length - 1; 
        for(int k = arr.length - 1; k >= 0; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            }else{
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        return result;

    }


    public void printArray(int[] arr){
        int n = arr.length;

        for(int i =0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
