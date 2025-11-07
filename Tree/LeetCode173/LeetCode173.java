package Tree.LeetCode173;
import java.util.*;
//02-07-2023
//173.Binary Search Tree Iterator.
public class LeetCode173 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(7);
        tree.root.left = new Node(3);
        tree.root.right = new Node(15);
        tree.root.right.left = new Node(9);
        tree.root.right.right = new Node(20);

        tree.BSTIterator(tree.root);
        System.out.println(tree.next());
        System.out.println(tree.next());
        System.out.println(tree.hasNext());
        System.out.println(tree.next());
        System.out.println(tree.hasNext());
        System.out.println(tree.next());
        System.out.println(tree.hasNext());
        System.out.println(tree.next());
        System.out.println(tree.hasNext());
    }
}
class BST{
    Node root;
    private Stack<Node> stack = new Stack<>();
    public void BSTIterator(Node root) {
        pushAll(root);
    }
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        Node node = stack.pop();
        pushAll(node.right);
        return node.data;
    }
    private void pushAll(Node ans){
        while (ans != null) {
            stack.push(ans);
            ans = ans.left;
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
