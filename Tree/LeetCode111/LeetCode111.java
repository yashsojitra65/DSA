package Tree.LeetCode111;
import java.util.*;
//25-05-2023
//111. Minimum Depth of Binary Tree;
public class LeetCode111 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        System.out.print(tree.minDepth(tree.root));
    }
}
class BTree{
    Node root;
    public int minDepth(Node root){
        int count = 0;
        if(root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            count++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node node = queue.poll();
                if(node.left == null && node.right == null) return count;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return count;
    }
//    public int minDepth(Node root){
//        if(root == null){
//            return 0;
//        }
//        if(root.left == null){
//            return 1 + minDepth(root.right);
//        } else if (root.right == null) {
//            return 1 + minDepth(root.left);
//        }
//        return 1 + Math.min(minDepth(root.left),minDepth(root.right));
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
