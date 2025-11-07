package Tree.BuildBST;
//28-06-2023
public class Build {
    public static void main(String[] args) {
        int arr[] = {5,1,5,3,4,2,7};
        Node root = null;

        for(int i=0; i< arr.length; i++){
            root = insert(root,arr[i]);
        }
        inorder(root);
    }
    public static Node insert(Node root,int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = insert(root.left,value);
        }else{
            root.right = insert(root.right,value);
        }
        return root;
    }
    public static void inorder(Node root){
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
