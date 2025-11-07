package Tree.LeetCode112;
//26-05-2023
//112. Path Sum.
public class LeetCode112 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(5);
        tree.root.left = new Node(4);
        tree.root.left.left = new Node(11);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.right = new Node(2);
        tree.root.right = new Node(8);
        tree.root.right.left = new Node(13);
        tree.root.right.right = new Node(4);
        tree.root.right.right.right = new Node(1);

        int sum = 22;
        System.out.print(tree.hasPathSum(tree.root,sum));
    }
}
class BTree{
    Node root;
    public boolean hasPathSum(Node root,int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && root.data == sum){
            return true;
        }
        return hasPathSum(root.left,sum - root.data) || hasPathSum(root.right,sum - root.data);
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
