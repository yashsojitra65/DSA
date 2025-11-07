package Tree.LeetCode103;
import java.util.*;
//27-05-2023
//103. Binary Tree Zigzag Level Order Traversal.
public class LeetCode103 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        List<List<Integer>> ans;
        ans = tree.zigzagLevelOrder(tree.root);

        System.out.println("Zig Zag Traversal of Binary Tree ");
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
class BTree{
    Node root;
    public List<List<Integer>> zigzagLevelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                if(flag == true){
                    list.add(queue.poll().data);
                }else {
                    list.add(0,queue.poll().data);
                }
            }
            flag = !flag;
            ans.add(list);
        }
        return ans;
    }
}
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}
