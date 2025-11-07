package Tree.LeetCode515;
import java.util.*;
//24-10-2023
//515.Find Largest Value in Each Tree Row.
public class LeetCode515 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(9);

        System.out.println(tree.largestValues(tree.root));
    }
}
class BTree {
    Node root;

    public List<Integer> largestValues(Node root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;

            for (int i=0; i<size; i++) {
                Node node = queue.poll();
                max = Math.max(max,node.data);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.add(max);
        }
        return list;
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
