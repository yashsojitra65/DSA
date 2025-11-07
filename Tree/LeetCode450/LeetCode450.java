package Tree.LeetCode450;
//29-06-2023
//450.Delete Node in a BST.
public class LeetCode450 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);

        tree.deleteNode(tree.root,3);
        tree.inorder(tree.root);
    }
}
class BST{  
    Node root;
    public Node deleteNode(Node root,int val){
        Node node = root;
        if(node.data > val){
            node.left = deleteNode(node.left,val);
        } else if (node.data < val) {
            node.right = deleteNode(node.right,val);
        }else {
            if(node.left == null && node.right == null){
                return null;
            }
            if(node.left == null){
                return node.right;
            }
            if(node.right == null){
                return node.left;
            }
            Node ans = helper(node.right);
            node.data = ans.data;
            root.right = deleteNode(node.right, ans.data);
        }
        return root;
    }
    private Node helper(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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
