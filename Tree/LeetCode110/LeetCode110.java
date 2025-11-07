package Tree.LeetCode110;
//25-05-2023
//110. Balanced Binary Tree.
public class LeetCode110 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
//        tree.root.right.left.left = new Node(20);
//        tree.root.right.left.right = new Node(25);
        tree.root.right.right = new Node(7);

        System.out.println(tree.isBalanced(tree.root));
    }
}
class BTree{
    Node root;
    public boolean isBalanced(Node root){
        return Height(root) != -1;
    }
    int Height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = Height(root.right);
        if(rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight,rightHeight) + 1;
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
