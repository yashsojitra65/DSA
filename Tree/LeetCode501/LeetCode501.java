package Tree.LeetCode501;
import java.util.*;

public class LeetCode501 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.right = new Node(2);
        tree.root.right.left = new Node(2);

        int[] ans = tree.findMode(tree.root);
        System.out.println(Arrays.toString(ans));
    }
}
class BTree{
    Node root;
    public int[] findMode(Node root){
        Map<Integer, Integer> map = new HashMap();
        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            map.put(node.data, map.getOrDefault(node.data, 0) + 1);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        int maxFreq = 0;
        for (int key : map.keySet()) {
            maxFreq = Math.max(maxFreq, map.get(key));
        }

        List<Integer> list = new ArrayList();
        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
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
