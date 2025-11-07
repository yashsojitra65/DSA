package Tree.LeetCode783;
import java.util.*;
//31-08-2023
//783.Minimum Distance Between BST Nodes.
public class LeetCode783 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(27);
        tree.root.right = new Node(34);
        tree.root.right.right = new Node(58);
        tree.root.right.right.left = new Node(50);
        tree.root.right.right.left.left = new Node(44);
//        tree.root = new Node(4);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(6);
//        tree.root.left.left = new Node(1);
//        tree.root.left.right = new Node(3);
        System.out.println(tree.minDiffInBST(tree.root));
    }
}
class BST {
    Node root;
    List<Integer> list = new ArrayList<>();
    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    public int minDiffInBST(Node root) {
        inorder(root);
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<list.size(); i++){
            ans = Math.min(ans, list.get(i) - list.get(i-1));
        }
        return ans;
    }
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
