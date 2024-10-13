package javaDSAfreeCodeCamp.SimpleSinglyLinkedList;


public class SinglyLinkedList {
    

    private ListNode head;


    private static class ListNode{
        
        private int data; // Generic type
        private ListNode next;
         
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }       

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        ListNode fiveth = new ListNode(15);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fiveth;
        // sll.DisplayLinkedList();

        // head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);
        // head.next = second;
        // second.next = third;
        // third.next = fourth;


        // sll.DisplayLinkedList();
        // sll.GetLenOfLL();
        // sll.InsertNodeAtFirst(33);
        // sll.InsertNodeAtLast(44);
        // sll.InsertNodeAtLast(33);
        // sll.InsertNodeATLast(69);
        // sll.InsertAt(69, 4);
        // sll.deleteFirst();
        // sll.deleteLast();
        // sll.DisplayLinkedList();
        // System.out.println();
        // System.out.println(sll.SearchElement(8));
      
        // System.out.println(sll.SearchElement(8));
        // sll.DeleteNodeAt(4);
        // // sll.DeleteNodeAt(2);
        // // sll.DeleteNodeAt(0);
        
      

        
                                           // ListNode head =  new ListNode(10);
                                           // ListNode second = new ListNode(8);
                                           // ListNode third = new ListNode(1);
                                           // ListNode fourth = new ListNode(11);
           //reverse a LL                  // head.next = second;
                                           // second.next = third;
                                           // third.next = fourth;
                                   
                                           // SinglyLinkedList sll2 = new SinglyLinkedList();
                                           // sll2.Display(head);
                                           // System.out.println();
                                           // ListNode ReverseLLhead = sll2.reverse(head);
                                           // sll2.Display(ReverseLLhead);
        

    
    //    System.out.println(sll.FindNthElementFromLast(2));

    // ListNode yoniga = sll.GetNthnodeFromEnd(2);
    // System.out.println(yoniga.data);

    SinglyLinkedList sll2 = new SinglyLinkedList();
        
        sll2.head = new ListNode(1);
        ListNode second2 = new ListNode(2);
        ListNode third2 = new ListNode(3);
        ListNode fourth2 = new ListNode(4);
        ListNode fiveth2 = new ListNode(5);
        fiveth2.next = third2;

        sll2.head.next = second2;
        second2.next = third2;
        third2.next = fourth2;
        fourth2.next = fiveth2;

        // sll2.DisplayLinkedList();
        // sll2.RemoveDuplicateFromSortedLL();
        // System.out.println();
        // sll2.DisplayLinkedList();
        // sll2.AddnodeTosortedLL(11);
        // System.out.println();
        // sll2.DisplayLinkedList();
        // sll2.removeElementLL(10);
        // System.out.println();
        // sll2.DisplayLinkedList();

        System.out.println(sll2.containsLoop());
        System.out.println();
        System.out.println(sll2.findStartingOfloop().data);
        sll2.removeLoopofLL();
        System.out.println(sll2.containsLoop());
        


}

    public void Display(ListNode head){
        
        ListNode current = head;
        
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next; 
        }
        System.out.print("null");
    }

    public void DisplayLinkedList(){
        
        ListNode current = head;
        
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next; 
        }
        System.out.print("null");
    }

    public int GetLenOfLL(){
        if(head == null){
            return 0;
        }
        ListNode current = head;                                                 
        int len = 0;
        while(current != null){ 
            len++;
            current = current.next;
        }
       return len;
    }

    public void InsertNodeAtFirst(int element){
        ListNode newNode = new ListNode(element);
        newNode.next = head;
        head = newNode; 
    }

    public void InsertNodeAtLast(int element){
        ListNode x = new ListNode(element);
        if(head == null){
            head = x;
            return;
        }
        ListNode current = head;
            while(current.next != null ){
                current = current.next;
            }
            current.next = x;
        
        
    }

    public void InsertNodeATLast(int element){
        ListNode newNode = new ListNode(element);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current  = head;
        while(current.next != null){
            current = current.next;

        }
        current.next = newNode;
        
    }

    public void InsertAt(int element , int position){
       ListNode node = new ListNode(element);
       ListNode previous = head;
       if(position == 1){
            node.next = previous;
            head = node;
        }else{
            int count = 1;
            ListNode toInsert = new ListNode(element);
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = toInsert;
            toInsert.next = current;

        }

    }

    public ListNode deleteFirst(){
       if(head == null){
            return null;
       }
       ListNode x = head;
       head = head.next;
       x.next = null;   
       return x;
   }

    public ListNode deleteLast(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
            
        }
        previous.next = null;
        return current;
    }

    public void DeleteNodeAt(int position){
        // ListNode temp = null;
        if(position == 1){  
            // temp  = head;
            // head = head.next;
            // temp.next = null; 
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public boolean SearchElement(int element){
        ListNode current = head;
        
        while(current != null){
            if(current.data == element){
               return true;
            }
            current = current.next;
            
        }
        return false;
    }

  
    public ListNode reverse( ListNode head) {
        if (head == null) {
           return null;
        }
  
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
  
        while (current != null) {
           next = current.next;
           current.next = previous;
           previous = current;
           current = next;
        }
        return previous;
     }

    public int FindNthElementFromLast(int n){
        ListNode current = head;
        // if(head == null){
        //     return -1;
        // }
        // int position = 1;

        // while(current != null){
        //     current = current.next;
        //     position++;
        // }
        int positionToACC = n + 1;
        int position = 0;
        while(current != null) {
            if(position == positionToACC){
                return current.data;
            }
            current = current.next;
            position++;
        }
        return -1;
        
    }

    public ListNode GetNthnodeFromEnd(int n){
        if(head == null){
            return null;
        }
        // if(n <= 0){
        //     throw new  IllegalArgumentException("Invalid input N = " + n);
        // }
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        int count = 0;
        while(count < n){
            // if(pointer1 == null){
            //     throw new  IllegalArgumentException("N is greater than the total elements in the list " + n);
            // }
            pointer1 = pointer1.next;
            count++;
        }
        while(pointer1 != null){

            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }
        return pointer2;
    }

    public void RemoveDuplicateFromSortedLL(){
        ListNode current = head;
       while (current != null && current.next != null) {
        if(current.data == current.next.data){
            current.next = current.next.next;
        }else{
            current = current.next;
        }
       }
        
}

    public void AddnodeTosortedLL(int element){
        ListNode newnode = new ListNode(element);
        ListNode current = head;
        // ListNode prevoius = null;
        ListNode temp = null;

        while(current != null && current.data < newnode.data){
            // prevoius = current;
            temp = current;
            current = current.next;
            
        }

        temp.next = newnode;
        newnode.next = current;
        
    }

    public void removeElementLL(int element){
        ListNode current = head;
        ListNode previous = null;
        
        while (current != null && current.data != element) {
            previous = current;
            current = current.next;
        }

        if(current == null) return;
        previous.next = current.next;

        
    }

    public boolean containsLoop(){          // fluid cycle detection algo
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(slowptr == fastptr){
                return true;
          }
        }
        return false;
    }

    public void createAloopInLL(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head = first;
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    
    public ListNode getStartingNodeofLoop(ListNode slowptr){
        ListNode temp = head;
        while(slowptr != temp){
            temp = temp.next;
            slowptr = slowptr.next;
        }
        return temp;
    }

    public ListNode findStartingOfloop(){
        ListNode fastptr = head;
        ListNode slowptr = head;

        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;

            if(fastptr == slowptr){
                return getStartingNodeofLoop(slowptr);
            }
        }

        return null;
    }

    public void removeLoopofLL(){
        ListNode fastptr = head;
        ListNode slowptr = head;

        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;

            if(fastptr == slowptr){
                removeLoop(slowptr);
            }
        }

    
    }

    public void removeLoop(ListNode slowptr){
            ListNode current = head;

            while(current.next != slowptr.next){
                current = current.next;
                slowptr = slowptr.next;
            }

            slowptr.next = null;
    }

    public ListNode merge(ListNode a , ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(a != null && b != null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if(a == null){
            tail.next = b;
    
        }else{
            tail.next = a;
        }

        return dummy.next;

    }
     
    public ListNode addListnode(ListNode a , ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null && b != null) {
            int x = (a != null) ?  a.data: 0;
            int y = (b != null) ?  b.data: 0;

            int sum = carry + x + y;
            
            carry = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if(a != null) a = a.next;
            if(b != null) b = b.next;

        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }

        return dummy.next;
    }
}




