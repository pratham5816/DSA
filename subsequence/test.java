package javaDSAfreeCodeCamp.subsequence;

public class test {
    
    boolean isSubseq(String str , String seq){
        int i = 0;
        int j = 0;
        while(i < str.length() && j < seq.length()){
            if(str.charAt(i) == seq.charAt(j)){
                j++;
            }
            i++;
        }
        return j == seq.length(); 
    }
}
