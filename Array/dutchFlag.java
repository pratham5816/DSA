package javaDSAfreeCodeCamp.Array;


public class dutchFlag {
    public void solve(int[] arr){
      int i =0;
      int j = 0;
      int k = arr.length -1;

      while(i <= k){
        if(arr[i] == 0){
            swap(arr ,i , j);
            i++;
            j++; 
        }else if(arr[i] == 1){
            i++;
        }else if(arr[i] == 2){
            swap(arr, i , k);
            k--;
        }
      }
    }

    public void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        dutchFlag x = new dutchFlag();
        int[] arr = new int[] {2,2,1,0,2,1,0,0,1,1};
        x.solve(arr);
        x.printArr(arr);

    }
}
