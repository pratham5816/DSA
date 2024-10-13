package javaDSAfreeCodeCamp.Stack;
import java.util.Stack;

import javaBrocode.stringmethods;

public class ReverseString {
    
    public static String reverse(String str){
        // Stack<Character> stack = new Stack<>();
        // char[] chars = str.toCharArray();


        // for(char c : chars){
        //     stack.push(c);
        // }

        // for(int i = 0; i < str.length(); i++){
        //     chars[i] = stack.pop();
        // }

        // return new String(chars);


        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();


        for(char c : chars){
            stack.push(c);
        }

        for(int i = 0; i < str.length(); i++){
            chars[i] = stack.pop(); 
        }

        return new String(chars);

    }

    public static void main(String[] args) {
        String str  = "ABCD";
        System.out.println("Before - " + str);
        System.out.println("After - " + reverse(str));
    }
}
