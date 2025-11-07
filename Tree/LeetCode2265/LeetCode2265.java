package Tree.LeetCode2265;
//02-11-2023
//2265.Count Nodes Equal to Average of Subtree.
public class LeetCode2265 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(4);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(0);
        tree.root.left.right = new Node(1);
        tree.root.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println(tree.averageOfSubtree(tree.root));
    }
}
class BTree{
    Node root;
    int count = 0;
    public int averageOfSubtree(Node root){
        helper(root);
        return count;
    }
    public int helper(Node root){
        if(root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        int sum = root.data;

        if(root.left != null){
            sum += root.left.data;
        }
        if(root.right != null){
            sum += root.right.data;
        }
        if(sum / (left + right + 1) == root.data){
            count++;
        }
        root.data = sum;
        return left + right + 1;
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