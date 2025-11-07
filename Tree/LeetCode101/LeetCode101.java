package Tree.LeetCode101;

public class LeetCode101 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);

        System.out.print(tree.isSymmetric(tree.root));
    }
}
class BTree{
    Node root;
    public boolean isSymmetric(Node root){
        return isMirror(root,root);
    }
    private boolean isMirror(Node n1,Node n2){
        if(n1 == null && n2 == null){
            return true;
        }
        if(n1 == null || n2 == null){
            return false;
        }
        return n1.data == n2.data && isMirror(n1.right,n2.left) && isMirror(n1.left,n2.right);
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
