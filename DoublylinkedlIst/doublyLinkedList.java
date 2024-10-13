package javaDSAfreeCodeCamp.DoublylinkedlIst;

import java.util.NoSuchElementException;

import javaBrocode.nestedloops;

public class doublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;
     
    private class ListNode{
        private int data;
        private ListNode previous;
        private ListNode next;


        public ListNode(int data){
            this.data = data;
        }
    }

    public doublyLinkedList(){
         this.head = null;
         this.tail = null;
         this.length = 0; 
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void DisplayForward(){
        ListNode temp = head;
        if(head == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void DisplayBackward(){
        ListNode temp = tail;
        if(temp == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data +" --> ");
            temp = temp.previous;
        }
        System.out.print("null");
        
    }

    // public void insertLast(int element){
    //     ListNode newNode = new ListNode(element);
    //     if(isEmpty()){
    //         head = newNode;
    //     }else{
    //         tail.next = newNode;
    //     }
    //     newNode.previous = tail;
    //     tail = newNode;
    //     length++; 
    // }
    
    public void insertFirst(int element){
        ListNode newNode = new ListNode(element);
        if(isEmpty()){
            tail = newNode;
            length++;
        }else{
            head.previous = newNode;
            
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int element){
        ListNode newNode = new ListNode(element);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
        }
       
        tail = newNode;
        length++;

    }

    public void DeleteFirstNode(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
    }

    public void DeleteLastNode(){
        ListNode temp = head;
        if(isEmpty()){
            throw new NoSuchElementException();
        }
            
        if(head == tail){
           head = null;
        }else{
            temp = tail.previous;
        }
        tail.previous = null;
        tail = temp;
        temp.next = null;
        
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();

        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);
        
        dll.DisplayForward();
        dll.insertFirst(69);
        System.out.println();
        dll.insertLast(69);
        dll.DeleteFirstNode();
        dll.DeleteFirstNode();

        dll.DeleteLastNode();
        dll.DeleteFirstNode();
        dll.DeleteFirstNode();
        dll.DeleteFirstNode();
        dll.DisplayForward();
    }
}
