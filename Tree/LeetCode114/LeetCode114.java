package Tree.LeetCode114;
import java.util.*;
//12-06-2023
//114. Flatten Binary Tree to Linked List.
public class LeetCode114 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(6);

        tree.flatten(tree.root);
        while(tree.root.right != null)
        {
            System.out.print(tree.root.data + "-> ");
            tree.root = tree.root.right;
        }
        System.out.print(tree.root.data);
    }
}
class BTree {
    Node root;
    Node prev = null;

        public void flatten(Node root){
        if(root == null){
            return;
        }

        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
//    public void flatten(Node root) {
//        if (root == null){
//            return;
//        }
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//
//        while (!stack.isEmpty()){
//            Node temp = stack.peek();
//            stack.pop();
//
//            if(temp.right != null){
//                stack.push(temp.right);
//            }
//            if(temp.left != null){
//                stack.push(temp.left);
//            }
//            if(!stack.isEmpty()){
//                temp.right = stack.peek();
//            }
//            temp.left = null;
//        }
//    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
