package javaDSAfreeCodeCamp.BinarySearch;


public class LinearSearch {
    public static void main(String[] args) {

        // int[] x = {2,3,5,1,44,2,4,33};
        // int[] y = {1,3,5,6,7,8,9,11};
        LinearSearch li = new LinearSearch();
        // System.out.println(li.LiSearch(x, 33));
        // System.out.println(li.LiSearch(y, 9));
        // System.out.println(li.BinarySearch(z, 5));
    //     int[] z = { 1, 10, 20, 47, 59, 65, 75, 88, 99 };
    //   System.out.println(li.binarySearch(, 65));
        // System.out.println(x[7]);
        
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(li.BinarySearch(array, 5));
    }
    
    public int LiSearch(int arr[] , int element){
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        if(arr.length == 0 || arr == null){
            return -1;
        }
        
        return -1;
    
    }

    public int BinarySearch(int arr[] , int element){ 
        // if(arr.length == 0 || arr == null){
        //     return -1;
        // }

        int low = 0;
        int high = arr.length - 1;
        int mid =  (low + high) / 2;
        while (low <= high) {
            if(arr[mid] == element){
                return mid;
            }

            if(element < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            
        }
        return -1;
       
    }

    public int searchInsert(int[] arr , int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] ==  target) return mid;

            if(target < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
                         
        }return low;
    }
}

