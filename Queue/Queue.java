package javaDSAfreeCodeCamp.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {
    public ListNode front;
    public ListNode rear;
    public int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }


    public static void main(String[] args) {
        Queue x = new Queue();
        x.EnQueue(0);
        x.EnQueue(10);
        x.EnQueue(12);
        x.Display();
        x.DeQueue();
        
        x.Display(); 
    }

    public void EnQueue(int element){
        ListNode newNode = new ListNode(element);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public void DeQueue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        
        // int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
    }

    public void Display(){
        if(isEmpty()) return;
        ListNode current = front;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0; 
    }

    // public String GenerateBinaryNums(int n){
    //     String[] result = new String[n];
    //     Queue<String> q = new LinkedList<>(); 
    // }
}
