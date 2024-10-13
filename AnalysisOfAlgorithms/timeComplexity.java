package javaDSAfreeCodeCamp.AnalysisOfAlgorithms;

public class timeComplexity {
    public static void main(String[] args) {
        double now =System.currentTimeMillis();
        

        timeComplexity demo  = new timeComplexity();
        System.out.println(demo.findSum(99999));
        System.out.println("Time Taken = " + (System.currentTimeMillis() - now) + "MILIS");
    }

    // public int findSum(int n){
    //     return n * (n+1) /2;
    // }

    public int findSum(int n){
        int sum =0;
        for(int i =0 ; i < n; i++){
            sum += i;
        }
        return sum;
    }
}
