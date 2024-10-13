package javaDSAfreeCodeCamp.DynamicProgramming;

public class fab {

    public int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int left = fib(n-1);
        int right = fib(n-2);
        return left + right;
    }


    public int fib_dynamicP(int n ){  /// bottom up
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;
        for(int i = 2; i <= n;i++){
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];
    }

    public int fib2(int[] memo , int n){
        if(memo[n] == 0){
            if(n <= 2){
                memo[n] = n;
            }else{
                int left = fib2(memo , n-1);
                int right = fib2(memo , n-2);
                memo[n] = left + right;
            }
        }
        return memo[n];   
    }
}
 
 