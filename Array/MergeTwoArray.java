package javaDSAfreeCodeCamp.Array;

public class MergeTwoArray {
    public void MergeTwoArr(int[] arr1 , int[] arr2 ){
        int[] resultArr = new int[arr1.length + arr2.length];
        int n = arr1.length;
        int m = arr2.length;
        int i = 0 , j = 0 , k =  0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                resultArr[k] = arr1[i];
                i++;
            }else{
                resultArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n){
            resultArr[k] = arr1[i];
            i++; k++;
        }
        while(j < m){
            resultArr[k] = arr2[j];
            j++; k++;
        }
    }
}
