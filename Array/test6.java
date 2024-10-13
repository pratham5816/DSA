package javaDSAfreeCodeCamp.Array;

public class test6 {
    public static void main(String[] args) {
        
        test6 x = new test6();
        // x.MoveZero(new int[] {8,1,0,2,1,0,3});
        // System.out.println();
        // x.MoveZero2(new int[] {8,1,0,2,1,0,3});
        // System.out.println();
        // x.ReSize(new int[]{1,2,4,5,6,7}, 10);;
        // x.MissingInArr(new int[]{2,4,1,8,6,3,7});


    }
    public void arrayDemo(){
        int[] arr = { -4,-1,0,3,10};
        int[] result = sortedSq(arr);
        printArray(result);
    }
    public void MoveZero(int[] array){
        int zeroC = 0;
        int[] newArr = new int[array.length];
        int arrIndex =0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != 0){
                newArr[arrIndex] = array[i];
                arrIndex++;
             } else if(array[i] == 0){
                zeroC++;
             }
        }
        if(zeroC > 0){
        for(int i =0; i <= zeroC; i++){
            newArr[arrIndex] = 0;
        }
        }
        
        for(int i =0; i < array.length;i++){
        System.out.print(newArr[i] + " ");
        }
    }

    public void MoveZero2(int[] arr){
            int j =0; // zero
            for(int i =0; i < arr.length; i++){
                if(arr[i] != 0 && arr[j] == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;                         
                } 

                if(arr[j] != 0){
                    j++;
                }
            }

              
        for(int i =0; i < arr.length;i++){
        System.out.print(arr[i] + " ");
        }
    }
        
    public void ReSize(int[] arr , int capacity){
        int[] temp =  new int[capacity];
        for(int i =0; i < arr.length; i++){
            temp[i] = arr[i];
        }

        arr = temp;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
   
    // public void arrayDemo(){
        
    //     int[] array = {2,3,534,432,332,56,78,89,3,3};
    //     printArray(array);

    // }
    
    public int[] sortedSq(int[] arr){
        int[] result = new int[arr.length];
        int i = 0; int j = arr.length - 1; 
        for(int k = arr.length - 1; k >= 0; k--){
            if(Math.abs(arr[j]) > Math.abs(arr[i])){
                result[k] = arr[j] * arr[j];
                j--;
            }else{
                result[k] = arr[i] * arr[i];
                i++;
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

    public void MissingInArr(int[] arr){
        
        int n = arr.length + 1;

        int sumOfFirstnNaturalNumbers = (n * (n + 1) ) / 2;
        int sumOfArray = 0;
        for(int i = 0; i < arr.length; i++){
                sumOfArray += arr[i];            
        }

        int missingnum = sumOfFirstnNaturalNumbers - sumOfArray;

        System.out.println(missingnum);
    }
    
    public void secondMaxVal(int[] arr){
         
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondmax = max; 
                max = arr[i];
            }else if(arr[i] > secondmax && arr[i] != max){
                secondmax = arr[i];

            }
        }
}

    public void MinInArr(int[] arr){

        
    if(arr == null || arr.length == 0){
        throw new IllegalArgumentException("Invalid Input!");
    }

    int min = arr[0];
    for(int i = 1; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
  System.out.println("Min - " + min);
}
     
    public void ReverseArray(int[] arr){
    


    int[] ReverseArray = new int[arr.length];

    for(int i = 0; i < arr.length; i++){
        ReverseArray[(arr.length -1) - i] = arr[i];

    }


   
    System.out.println("ORIGNAL ARR - ");
    for(int i =0; i < arr.length; i++){
        
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    System.out.println("REVERSE ARR -");
    for(int i =0; i < ReverseArray.length; i++){
        
        System.out.print(ReverseArray[i] + " ");
    }
}

    public void removeEvenEle(int[] Array){
        int len = Array.length;
        int Evencount = 0;
        int OddCount = 0;
        for(int i = 0; i < len; i++){
            if(Array[i] % 2 == 0){
                Evencount++;
            }
            else{
                OddCount++;
            }
        }


        int[] oddArray = new int[OddCount];
        int indexnew =0;
        for(int i = 0; i < Array.length; i++){
            if(Array[i] % 2 != 0){
                oddArray[indexnew] = Array[i];
                indexnew++;
            }

        }


        for(int i = 0; i < oddArray.length; i++){
            System.out.print(oddArray[i] + " ");
        }
    }

    

}