package javaDSAfreeCodeCamp;

import java.util.Stack;


public class SymmetricBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.right);
        stack.push(root.left);
        while(!stack.isEmpty()){
            TreeNode n1 = stack.pop();
            TreeNode n2 = stack.pop();
            if(n1 == null && n2 == null) continue;
            if(n1 == null || n2 == null || n1.val != n2.val) return false;
            stack.push(n1.left);
            stack.push(n2.right);
            stack.push(n1.right);
            stack.push(n2.left);
        }
        return true;

    }
}
