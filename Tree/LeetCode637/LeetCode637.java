package Tree.LeetCode637;

import java.util.*;
//01-06-2023
//637. Average of Levels in Binary Tree.
public class LeetCode637 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        System.out.print(tree.averageOfLevels(tree.root));
    }
}
class BTree{
    Node root;
    public List<Double> averageOfLevels(Node root){
        List<Double> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i=0; i<size; i++){
                Node node = queue.poll();
                sum += node.data;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            ans.add(sum/size);
        }
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
