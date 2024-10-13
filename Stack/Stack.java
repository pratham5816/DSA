package javaDSAfreeCodeCamp.Stack;

import java.util.EmptyStackException;
import java.util.List;
import java.util.NoSuchElementException;

public class Stack {
    private int length;
    private ListNode top;

    private class ListNode{
        private int data;
        private ListNode next;
        

        public ListNode(int data){
            this.data = data;
        }
    }

    public void displayStack(){
        while(top != null){
            System.out.print(" --> " + top.data);
        
            top = top.next;
        }
    }

    public Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length ==0;
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next= top;
        top = newNode;
        length++;
    }

    public void pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        top = top.next;
        length--;
    }

    public static void main(String[] args) {
        Stack stackmera = new Stack();
        stackmera.push(1);
        stackmera.push(5);
        stackmera.push(10);
        stackmera.push(15);
        // stackmera.pop();
        // stackmera.pop();
        // stackmera.pop();
        // stackmera.pop();
        stackmera.displayStack();
    }
 
}

