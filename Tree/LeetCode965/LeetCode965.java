package Tree.LeetCode965;
//02-06-2023
//965.Univalued Binary Tree.
public class LeetCode965 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(2);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(2);
        tree.root.right.right = new Node(2);

        System.out.println(tree.isUnivalTree(tree.root));
    }
}
class BTree{
    Node root;

    public boolean isUnivalTree(Node root){
        if(root == null){
            return true;
        }
        return value(root,root.data);
    }
    boolean ans = true;
    private boolean value(Node root,int value){
        if(root == null){
            return true;
        }
        if(root.data != value){
            ans = false;
        }
        value(root.left,value);
        value(root.right,value);
        return ans;
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