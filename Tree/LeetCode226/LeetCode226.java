package Tree.LeetCode226;
import java.util.*;
//22-08-2023
//226.Invert Binary Tree.
public class LeetCode226 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(9);

        tree.invertTree(tree.root);
        tree.levelOrder(tree.root);
    }
}
class BTree{
    Node root;

    public Node invertTree(Node root){
        if(root == null){
            return null;
        }
        Node right = invertTree(root.right);
        Node left = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }
    public Node levelOrder(Node root){
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
        return root;
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
