package Tree.LeetCode404;
//26-05-2023
//404. Sum of Left Leaves.
public class LeetCode404 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(7);

        System.out.print(tree.sumOfLeftLeaves(tree.root));
    }
}
class BTree{
    Node root;
    public int sumOfLeftLeaves(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                count += root.left.data;
            }
        }else {
            count += sumOfLeftLeaves(root.left);
        }
        count += sumOfLeftLeaves(root.right);
        return count;
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
