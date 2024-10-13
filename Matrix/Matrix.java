package javaDSAfreeCodeCamp.Matrix;

public class Matrix {
    
    public void serach(int[][] matrix , int n , int x){
        int i = 0;
        int j = n - 1;
        while(i < n && j >= 0){
            if(matrix[i][j] == x){
                System.out.println("X found at - " + i + "," + j);
                return;
            }

            if(matrix[i][j] > x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not found");
    }

    public void spiralPrint(int[][] matrix , int r , int c){
        int i , k = 0 , I = 0;
        while(k < r && I < c){
            for(i = I; i < c; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for(i = k; i < r; i++){
                System.out.print(matrix[i][c - 1]  + " ");
            }
            c--;
            if(k < r){
                for(i = c - 1; i >= I; i--){
                    System.out.print(matrix[r -1][i] + " ");
                }
                r--;
            }
            if(I < c){
                for(i = r - 1; i >= k; i--){
                    System.out.print(matrix[i][I] + " ");
                }

            }
            I++;                                         
        }
        
    }

    public static void main(String[] args) {
        int[][] matrixh = {{10,20,30,40} , {15,25,35,45} , {27,29,37,48} , {32,33,39,51}};
        int[][] matrix2 = {{1,2,3,4} , {5,6,7,8} , { 9,10,11,12} , {13,14,15,16}};
        Matrix x = new Matrix();
        x.serach(matrixh, 4, 32);
        x.spiralPrint(matrix2, 4, 4); 
    }
}
