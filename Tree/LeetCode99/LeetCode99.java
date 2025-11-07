package Tree.LeetCode99;
import java.util.*;
//03-07-2023
//99.Recover Binary Search Tree.
public class LeetCode99 {
    public static void main(String[] args) {
       BST tree = new BST();
       tree.root = new Node(1);
       tree.root.left = new Node(3);
       tree.root.left.right = new Node(2);

       tree.recoverTree(tree.root);
       tree.levelOrderTree();
    }
}
class BST{
    Node root;
    public void recoverTree(Node root){
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        Node last = null;
        Node first = null;
        Node second = null;

        while(temp != null || !stack.isEmpty()){
            while(temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            if(last != null && last.data > temp.data) {
                if(first == null){
                    first = last;
                }
                second = temp;
            }
            last = temp;
            temp = temp.right;
        }
        int val = first.data;
        first.data = second.data;
        second.data = val;
    }
    public void levelOrderTree(){
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