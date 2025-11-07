package Tree.LeetCode1161;
import java.util.*;
//17-10-2023
//1161.Maximum Level Sum of a Binary Tree.
public class LeetCode1161 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(-100);
        tree.root.left = new Node(-200);
        tree.root.right = new Node(-300);
        tree.root.right.left = new Node(-10);
        tree.root.left.left = new Node(-20);
        tree.root.left.right = new Node(-5);

        System.out.println(tree.maxLevelSum());
    }
}
class BTree{
    Node root;
    int level = 0;
    int ans = 0;
    int maxSum = 0;
    public int maxLevelSum(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 1;
        int maxLevel = 1;
        int maxSum = root.data;

        while (!queue.isEmpty()){
            int levelSum = 0;
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                levelSum += node.data;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            if (levelSum > maxSum) {
                maxSum = levelSum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
}
class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}