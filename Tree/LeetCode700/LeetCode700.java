package Tree.LeetCode700;
//29-05-2023
//700. Search in a Binary Search Tree.
public class LeetCode700 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right = new Node(7);
        int val = 2;

        System.out.print(tree.searchBST(tree.root,val));
    }
}
class BTree{
    Node root;
    public int searchBST(Node root,int val){
        while (root != null && root.data != val){
            if(val < root.data){
                root = root.left;
            }else {
                root = root.right;
            }
        }
        return root.data;
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
