package Tree.LeetCode617;
import java.util.*;
//01-07-2023
//617.Merge Two Binary Trees.
public class LeetCode617 {
    public static void main(String[] args) {
        BST tree1 = new BST();
        tree1.root = new Node(1);
        tree1.root.left = new Node(3);
        tree1.root.right = new Node(2);
        tree1.root.left.left = new Node(5);
        BST tree2 = new BST();
        tree2.root = new Node(2);
        tree2.root.left = new Node(1);
        tree2.root.left.right = new Node(4);
        tree2.root.right = new Node(3);
        tree2.root.right.right = new Node(7);

        BST ans = new BST();
        Node node = ans.mergeTrees(tree1.root,tree2.root);
        ans.levelOrderTree(node);
    }
}
class BST{
    Node root;
    public Node mergeTrees(Node root1,Node root2){
        if(root1 == null){
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        Node node = new Node(root1.data + root2.data);
        node.left = mergeTrees(root1.left,root2.left);
        node.right = mergeTrees(root1.right,root2.right);
        return node;
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
