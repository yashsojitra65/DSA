package Tree.LeetCode814;
//04-06-2023
//814. Binary Tree Pruning.
public class LeetCode814 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.right = new Node(0);
        tree.root.right.left = new Node(0);
        tree.root.right.right = new Node(1);

        System.out.println(tree.pruneTree(tree.root));
    }
}
class BTree{
    Node root;
    public Node pruneTree(Node root){
        return prune(root,0);
    }
    private Node prune(Node root,int value){
        if(root == null){
            return null;
        }
        root.left = prune(root.left,value);
        root.right = prune(root.right,value);

        if(root.left == null && root.right == null && root.data == value){
            return null;
        }
        return root;
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
