package Tree.LeetCode235;
//30-06-2023
//235.Lowest Common Ancestor of a Binary Search Tree.
public class LeetCode235 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(6);
        Node p = tree.root.left = new Node(2);
        tree.root.left.left = new Node(0);
        tree.root.left.right = new Node(4);
        tree.root.left.right.left = new Node(3);
        tree.root.left.right.right = new Node(5);
        Node q = tree.root.right = new Node(8);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);

        Node ans = tree.lowestCommonAncestor(tree.root,p,q);
        System.out.print(ans.data);
    }
}
class BST{
    Node root;
    public Node lowestCommonAncestor(Node root,Node p,Node q){
        if(root == null){
            return null;
        }
        int curr = root.data;
        if(curr < p.data && curr < q.data){
            return lowestCommonAncestor(root.right,p,q);
        }
        if(curr > p.data && curr > q.data){
            return lowestCommonAncestor(root.left,p,q);
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
