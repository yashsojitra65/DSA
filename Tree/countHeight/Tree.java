package Tree.countHeight;

public class Tree {
    public static void main(String[] args) {
        BTree tree = new BTree();
//        tree.root = new Node(10);
//        tree.root.left = new Node(20);
//        tree.root.right = new Node(30);
//        tree.root.left.left = new Node(40);
//        tree.root.left.right = new Node(60);
//        tree.root.left.right.left = new Node(70);
//        tree.root.left.right.right = new Node(80);
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.left.left = new Node(50);
        tree.root.left.left.right = new Node(60);
        tree.root.left.right = new Node(70);
        tree.root.right.left = new Node(80);

        System.out.println(tree.Height(tree.root));
        System.out.println(tree.countNode(tree.root));
    }
}
class BTree{
    Node root;
    public int Height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }
    public int countNode(Node root){
        if(root == null){
            return 0;
        }
        int lcount = countNode(root.left);
        int rcount = countNode(root.right);
        return lcount + rcount + 1;
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
