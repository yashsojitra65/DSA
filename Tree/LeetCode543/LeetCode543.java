package Tree.LeetCode543;
//26-05-2023
//543. Diameter of Binary Tree.
public class LeetCode543 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.left.left = new Node(5);
        tree.root.right.left.left.left = new Node(6);
        tree.root.right.right = new Node(6);
        tree.root.right.right.right = new Node(7);
        tree.root.right.right.right.right = new Node(8);
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);

        System.out.print(tree.diameterOfBinaryTree(tree.root));
    }
}
class BTree{
    Node root;
    public int diameterOfBinaryTree(Node root){
        int[] ans = new int[1];
        height(root,ans);
        return ans[0];
    }
    private int height(Node temp,int[] ans){
        if(temp == null){
            return 0;
        }
        int lh = height(temp.left,ans);
        int rh = height(temp.right,ans);
        ans[0] = Math.max(ans[0],lh + rh);
        return 1 + Math.max(lh,rh);
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
