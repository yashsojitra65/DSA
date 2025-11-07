package Tree.LeetCode1448;
//29-08-2023
//1448.Count Good Nodes in Binary Tree.
public class LeetCode1448 {
    public static void main(String[] args) {
        Btree btree = new Btree();
        btree.root = new Node(3);
        btree.root.left = new Node(1);
        btree.root.left.left = new Node(3);
        btree.root.right = new Node(4);
        btree.root.right.left = new Node(1);
        btree.root.right.right = new Node(5);

        System.out.println(btree.goodNodes(btree.root));
    }
}
class Btree{
    Node root;
    int count = 0;
    public int goodNodes(Node root){
        helper(root,Integer.MIN_VALUE);
        return count;
    }
    private void helper(Node root,int max){
        if(max <= root.data){
            count++;
        }
        if(root.right != null){
            helper(root.right,Math.max(root.data, max));
        }
        if(root.left != null){
            helper(root.left,Math.max(root.data,max));
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
