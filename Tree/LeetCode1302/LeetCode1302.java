package Tree.LeetCode1302;
//14-06-2023
//1302.Deepest Leaves Sum.
public class LeetCode1302 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(7);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(6);
        tree.root.right.right.right = new Node(8);

        System.out.print(tree.deepestLeavesSum(tree.root));
    }
}
class BTree {
    Node root;
    private int sum = 0;
    private int depth;

    public int deepestLeavesSum(Node root) {
        depth = 1;
        helper(root, 1);
        return sum;
    }
    private void helper(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == depth) {
            sum += root.data;
        }else if (level > depth) {
            sum = root.data;
            depth = level;
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
//    public int deepestLeavesSum(Node root){
//        Queue<Node> queue = new LinkedList();
//        queue.offer(root);
//        int sum = 0;
//        while (queue.size() > 0) {
//            sum = 0;
//            for (int i = queue.size(); i > 0; i--) {
//                root = queue.poll();
//                sum += root.data;
//                if (root.left != null)
//                    queue.offer(root.left);
//                if (root.right != null)
//                    queue.offer(root.right);
//            }
//        }
//        return sum;
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
