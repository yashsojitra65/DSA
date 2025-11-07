package Tree.LeetCode701;
import java.util.*;
//28-06-2023
//701.Insert into a Binary Search Tree.
public class LeetCode701 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right = new Node(7);

        tree.insertIntoBST(tree.root,5);
        tree.levelOrderTree(tree.root);
    }
}
class BST{
    Node root;
    public Node insertIntoBST(Node root,int val) {
        if (root == null) {
            return new Node(val);
        }
        Node curr = root;
//        while (true){
//            if(curr.data <= val){
//                if(curr.right != null){
//                    curr = curr.right;
//                }else {
//                    curr.right = new Node(val);
//                    break;
//                }
//            }else {
//                if(curr.left != null){
//                    curr = curr.left;
//                }else {
//                    curr.left = new Node(val);
//                    break;
//                }
//            }
//        }
        while (true) {
            if (curr.data > val) {
                if (curr.left == null) {
                    curr.left = new Node(val);
                    break;
                }
                curr = curr.left;
            } else {
                if (curr.right == null) {
                    curr.right = new Node(val);
                    break;
                }
                curr = curr.right;
            }
        }
        return root;
    }
    public void levelOrderTree(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
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