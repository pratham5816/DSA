package javaDSAfreeCodeCamp.Stack;


public class Stack_array {
    private int top;
    private int[] arr;
    
    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is Full!");
        }
        top++;
        arr[top] = data;
    }

    public boolean isFull(){ return arr.length == size();}
    public int size() { return top + 1;}
    public boolean isEmpty() { return top == -1;}
    public void displayArr(){
        while(top != arr.length){
            System.out.print(" --> " + arr[top]);
            top++;
        }
    }

    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        int result = arr[top];
        top--;
        
    }
    public static void main(String[] args) {
        Stack_array arr = new Stack_array();
        arr.push(0);
        arr.push(20);
        // arr.displayArr();
        System.out.println();
        
    }
}
