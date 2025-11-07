package Tree.LeetCode98;
//29-06-2023
//98.Validate Binary Search Tree.
public class LeetCode98 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(13);
        tree.root.left = new Node(10);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(12);
        tree.root.left.left.right = new Node(9);
        tree.root.left.left.right.left = new Node(8);
        tree.root.right = new Node(15);
        tree.root.right.left = new Node(14);
        tree.root.right.right = new Node(17);
        tree.root.right.right.left = new Node(16);

        System.out.print(tree.isValidBST(tree.root));
    }
}
class BST{
    Node root;

    public boolean isValidBST(Node root){
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean helper(Node root,int min,int max){
        if(root == null){
            return true;
        }
        if(root.data >= max || root.data <= min){
            return false;
        }
        return helper(root.left,min,root.data) && helper(root.right,root.data,max);
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
