package Tree.LeetCode1008;
//30-06-2023
//1008.Construct Binary Search Tree from Preorder Traversal.
public class LeetCode1008 {
    public static void main(String[] args) {
        Node root = null;
        int[] preorder = {8,5,1,7,10,12};
        root = bstFromPreorder(preorder);
        preorder(root);
    }
    public static Node bstFromPreorder(int[] preorder){
        return helper(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    private static Node helper(int[] preorder,int bound,int[] arr){
        if(arr[0] == preorder.length || preorder[arr[0]] > bound){
            return null;
        }
        Node root = new Node(preorder[arr[0]++]);
        root.left = helper(preorder,root.data,arr);
        root.right = helper(preorder,bound,arr);

        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
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
