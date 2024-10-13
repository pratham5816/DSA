package javaDSAfreeCodeCamp;

import java.util.Arrays;

public class ThreeSum {
    public void ThreeSum(int[] arr , int target){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++){
            int j = i + 1;
            int k = arr.length - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                    j++;
                    k--;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }
            } 
        }
    }
}
