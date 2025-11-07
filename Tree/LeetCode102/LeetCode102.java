package Tree.LeetCode102;
import java.util.*;
//30-05-2023
//102. Binary Tree Level Order Traversal.
public class LeetCode102 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        System.out.println(tree.levelOrder(tree.root));
    }
}
class BTree{
    Node root;
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while(size-- > 0) {
                Node temp = queue.poll();
                list.add(temp.data);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
            ans.add(list);
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