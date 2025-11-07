package Tree.LeetCode606;
//04-06-2023
//606. Construct String from Binary Tree.
public class LeetCode606 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);

        //System.out.print(tree.tree2str(tree.root));
        System.out.println(tree.sb(tree.root));
    }
}
class BTree{
    Node root;
    public String tree2str(Node root){
        String ans = String.valueOf(root.data);

        if(root.left != null){
            ans = ans + '(' + tree2str(root.left) + ')';
        }
        if(root.right != null){
            if(root.left == null){
                ans = ans + "()";
            }
            ans = ans + '(' + tree2str(root.right) + ')';
        }
        return ans;
    }
    StringBuilder sb = new StringBuilder();
    public String sb(Node root){
        dff(root);
        return sb.toString();
    }
    private void dff(Node root){
        if (root == null) {
            return;
        }
        sb.append(root.data);
        if (root.left != null || root.right != null) {
            sb.append('(');
            dff(root.left);
            sb.append(')');
            if (root.right != null) {
                sb.append('(');
                dff(root.right);
                sb.append(')');
            }
        }
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
