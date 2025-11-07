package Tree.LeetCode1325;
//02-06-2023
//1325. Delete Leaves With a Given Value.
public class LeetCode1325 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(4);

        System.out.println(tree.removeLeafNodes(tree.root,2));
    }
}
class BTree{
    Node root;
    public Node removeLeafNodes(Node root,int value){
        if(root == null){
            return null;
        }
        root.left = removeLeafNodes(root.left,value);
        root.right = removeLeafNodes(root.right,value);
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
