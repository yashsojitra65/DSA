package Tree.LeetCode938;
//28-08-2023
//938.Range Sum of BST.
public class LeetCode938 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.root.right = new Node(15);
        tree.root.right.right = new Node(18);

        System.out.println(tree.rangeSumBST(tree.root,7,15));
    }
}
class BST{
    Node root;
    int ans;

    public int rangeSumBST(Node root,int low,int high){
        ans = 0;
        helper(root, low, high);
        return ans;
//        if(root==null){
//            return 0;
//        }
//
//        if(root.data>=low && root.data<=high){
//            ans += root.data;
//
//        }
//        rangeSumBST(root.left,low,high);
//        rangeSumBST(root.right,low,high);
//        return ans;
    }
    public void helper(Node node, int low, int high) {
        if (node != null) {
            if (low <= node.data && node.data <= high) {
                ans += node.data;
            }
            if (low < node.data) {
                helper(node.left, low, high);
            }
            if (node.data < high) {
                helper(node.right, low, high);
            }
        }
    }
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}
