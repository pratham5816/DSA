package javaDSAfreeCodeCamp.simpleCircularSinglyLinkedLIst;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    
   
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;

        }
    }

    public CircularLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void DisplayCircularLinkedList(){
        if(last == null) return;
        ListNode firstnode = last.next;
        while(firstnode != last){
            System.out.print(" --> " + firstnode.data);
            firstnode = firstnode.next;
        }
        System.out.print(" --> " + firstnode.data + " --> last");
    }

    public void insertFirst(int element){
        ListNode newNode = new ListNode(element);
        if(last == null){
            last = newNode;
        }else{
             newNode.next = last.next;
        }
        last.next = newNode;
        length++;

    }

    public void insertLast(int element){
        ListNode newNode = new ListNode(element);
        ListNode temp = last;
        if(last == null){
            last = newNode;
            last.next = last;
        }else{
            newNode.next = last.next;
        }
        temp.next = newNode;
        last = newNode;
        length++;
    }

    public void removefisrt(){
      if(isEmpty()){
        throw new NoSuchElementException("Circular Linked List is already empty!");
      }
      ListNode temp = last.next;
      if(last.next == last){
        last = null;
      }else{
        last.next = temp.next;
      }
      
      temp.next = null;
      length--;
     
    }


    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        // cll.createCircularLinkedList();
        cll.insertFirst(5);
        cll.insertLast(10);
        cll.insertLast(15);
        cll.insertFirst(20);
        cll.DisplayCircularLinkedList();
        cll.removefisrt();
        cll.removefisrt();
        cll.removefisrt();
        cll.removefisrt();
        System.out.println();
        cll.DisplayCircularLinkedList();
    }
}
