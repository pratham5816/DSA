package javaDSAfreeCodeCamp.BinaryTree;
import java.util.Stack;


public class BinaryTree {
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        // TreeNode fivth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        // second.right = fivth;

    }

    public void preOrder(TreeNode root){

        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right); 

    }

    public void postOrder(TreeNode root){
        if(root == null){
            return;

        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void InOrder(TreeNode root){
        
        
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right); 


    }

    public void iterativeInorder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!= null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void IterativepostOrder(TreeNode root){
        // Stack<TreeNode> stack = new Stack<>();
        // TreeNode current = root;
        // if(current != null || !stack.isEmpty()){
        //     stack.push(current);
        //     current = current.left;
        // }else{
        //     TreeNode temp = stack.peek().right;
        //     if(temp == null){
        //         temp = stack.pop();
        //         System.out.println(temp.data + " ");
        //         while(!stack.isEmpty() && temp == stack.peek().right){
        //             temp = stack.pop();
        //             System.out.println(temp.data + " ");
        //             while(!stack.empty() && temp == stack.peek().right){
        //                 temp = stack.pop();
        //                 System.out.println(temp.data + " ");
        //             }
        //         }
        //     }else{
        //         current = temp;   
        //     }
        // }

        Stack<TreeNode> stack = new Stack<>(); 
        TreeNode current = root;
        while(!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }

                }else {
                    current = temp;
                }
            }
        }
    
    }

    public void iterativePreoder(TreeNode root){

        if(root == null){
            return; 
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data);
            if(temp.right != null){
                stack.push(temp.right);

            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public int findMax(TreeNode root){
        // if(root == null){
        //     return Integer.MIN_VALUE;
        // }
        // int Result = root.data;
        // int left = findMax(root.left);
        // int right = findMax(root.right);
        // if(left > Result) Result = left;
        // if(right > Result) Result = right;

        // return Result;



        if(root == null){
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);

        if(left > result) result = left;
        if(right > result) result = right;
        return result;
    }                 
      

    
    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.createBinaryTree();
        x.preOrder(x.root);
        System.out.println();
        x.InOrder(x.root);
        System.out.println();
        x.postOrder(x.root);
        System.out.println();
        x.iterativeInorder(x.root);
        System.out.println();
        x.IterativepostOrder(x.root);
        System.out.println();
        System.out.println(x.findMax(x.root));
        
    }

    
}
