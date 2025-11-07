package Tree.LeetCode230;
import java.util.*;

//29-06-2023
//230.Kth Smallest Element in a BST.
public class LeetCode230 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.left.left.left = new Node(1);

        System.out.print(tree.kthSmallest(tree.root,3));
    }
}
class BST{
    Node root;
    int a = 0;
    int b = 0;
    public int kthSmallest(Node root,int k){
        return helper(root,k);
    }
    public int helper(Node root, int k){
        if(root == null){
            return 0;
        }

        helper(root.left,k);
        a++;
        if(k == a){
            return b = root.data;
        }
        helper(root.right,k);
        return b;
    }
//    public int kthSmallest(Node root,int k){
//        List<Integer> list = new ArrayList<>();
//        helper(root,list);
//
//        return list.get(k-1);
//    }
//    private void helper(Node root,List<Integer> list){
//        if(root == null){
//            return;
//        }
//        helper(root.left,list);
//        list.add(root.data);
//        helper(root.right,list);
//    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
