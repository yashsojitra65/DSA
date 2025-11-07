package Tree.LeetCode513;
import java.util.*;
//07-06-2023
//513.Find Bottom Left Tree Value.
public class LeetCode513 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.left = new Node(7);

        System.out.print(tree.findBottomLeftValue(tree.root));
    }
}
class BTree{
    Node root;
    public int findBottomLeftValue(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            root = queue.poll();
            if(root.right != null){
                queue.add(root.right);
            }
            if(root.left != null){
                queue.add(root.left);
            }
        }
        return root.data;
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
