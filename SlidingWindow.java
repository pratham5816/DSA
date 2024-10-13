package javaDSAfreeCodeCamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SlidingWindow {
    public List<Integer> maxSildeing(int[] arr , int k){
            int[] ngeArr =  nextGreaterElement(arr);
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i <= arr.length -k; i++){
                int j = i;
                while(ngeArr[j] < i +k){
                    j = ngeArr[j];
                }

                result.add(arr[j]);
            }

            return result;
    }

    public int[] nextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length -1; i >=0; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                    stack.pop();
                }
            }
        

        if(stack.isEmpty()){
            result[i] = arr.length;
        }else{
            result[i] = arr[i];
        }
        stack.push(i);
       }
    return result;
    }


    public int maxSubArraySum(int[] arr , int k){
        int maxSum = 0;
        int windowSum = 0;
        int start = 0;
        for(int end = 0; end < arr.length; end++){
            windowSum = windowSum + arr[end];
            if(end >= k - 1){
                maxSum = Math.max(maxSum , windowSum);
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        return maxSum;
    }

}

