package javaDSAfreeCodeCamp.Array;

public class KadaeneAlgo {
    public int maxSubArraySum(int[] arr){
      int maxSoFar = arr[0];
      int currentMax = arr[0];
      for(int i = 1; i < arr.length; i++){
        currentMax = currentMax + arr[i];
        if(maxSoFar < currentMax){
            maxSoFar = currentMax;
        }
        if(arr[i] > currentMax){
            currentMax = arr[i];
        }
      }

      return maxSoFar;
    }


    public static void main(String[] args) {
        int[] arr = { 4,3,-2,6,-12,7,-1,6};
        KadaeneAlgo x = new KadaeneAlgo();
        System.out.println(x.maxSubArraySum(arr));

    }
}
