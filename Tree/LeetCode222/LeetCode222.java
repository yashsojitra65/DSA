package Tree.LeetCode222;
//12-06-2023
//222.Count Complete Tree Nodes.
public class LeetCode222 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);

        System.out.print(tree.countNode(tree.root));
    }
}
class BTree{
    Node root;
    int count = 0;
    public int countNode(Node root){
        if(root == null){
            return 0;
        }else{
            count++;
        }
        countNode(root.left);
        countNode(root.right);
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
