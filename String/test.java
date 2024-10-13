package javaDSAfreeCodeCamp.String;


public class test {

    public static void main(String[] args) {
        test x = new test();
        // x.palindrome(new String("madam"));    palindrome
        // x.palindromeWithStringBuffer("madam");  
    }


    public void palindrome(String str){
        String reverseStr ="";

        for(int i = str.length() - 1 ; i >= 0; i--){
            reverseStr += str.charAt(i);
        }

        if(reverseStr.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }

    
    public void palindromeWithStringBuffer(String str){
        StringBuffer x = new StringBuffer(str);
        String reverse = x.reverse().toString();
        
        if(str.equals(reverse)){
            System.out.println("True");

        }else{
            System.out.println("false");
        }
    }

    public boolean isPalindrome(String str){
        char[] CharArray = str.toCharArray();
        int start = 0;
        int end = str.length() -1;

        while(start < end){
            if(CharArray[start] != CharArray[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
