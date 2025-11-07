package Tree.LeetCode1379;
//02-08-2023
//1379.Find a Corresponding Node of a Binary Tree in a Clone of That Tree.
public class LeetCode1379 {
    public static void main(String[] args) {
        BTree original = new BTree();
        original.root = new Node(7);
        original.root.left = new Node(4);
        original.root.right = new Node(3);
        original.root.right.left = new Node(6);
        original.root.right.right = new Node(19);
        BTree cloned = new BTree();
        cloned.root = new Node(7);
        cloned.root.left = new Node(6);
        cloned.root.right = new Node(3);
        cloned.root.right.left = new Node(6);
        cloned.root.right.right = new Node(19);
        int target = 3;
        BTree tree = new BTree();

        Node ans = tree.getTargetCopy(original.root,cloned.root,target);
        System.out.println(ans.data);
    }
}
class BTree{
    Node root;

    public final Node getTargetCopy(Node original,Node cloned,int target){
        if(original == null || cloned == null){
            return null;
        }
        if(original.data == target && cloned.data == target){
            return cloned;
        }
        Node left = getTargetCopy(original.left,cloned.left,target);
        Node right = getTargetCopy(original.right,cloned.right,target);
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        return null;
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
