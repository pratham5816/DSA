package javaDSAfreeCodeCamp.BinarySearchTree;

public class BinarySearchTree {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public void insert(int value){
        root = insert(root, value);
    }
    public TreeNode insert(TreeNode root , int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }

        if(value < root.data){
            root.left = insert(root.left , value);
        }else{
            root.right = insert(root.right , value);
        }
        return root;       
    }

    public void InOrder(){
        InOrder(root);
    }

    public void InOrder(TreeNode root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);

    }

    public TreeNode search(TreeNode root , int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key > root.data){
            return search(root.right , key);
        }
        else{
            return search(root.left , key);
        }

    }

    public TreeNode search(int key){
       return search(root , key);
    }
     
    public isValid(TreeNode root , long min , long max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        
    }

   
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.InOrder();
        System.out.println();
        System.out.println(bst.search(878));

      

    }

}
