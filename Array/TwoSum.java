package javaDSAfreeCodeCamp.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {


    public static int[] sum(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(!map.containsKey(target - numbers[i])){
                map.put(numbers[i] , i);
            }else{
                result[1] = i;
                result[0] = map.get(target - numbers[i]); 
                return result;
            }
        }
       throw new IllegalArgumentException("not found!");
    }

    public int[] twoSum(int[] arr , int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[0];
    }
}
