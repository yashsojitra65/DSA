package Tree.LeetCode199;
import java.util.*;
//02-06-2023
//199.Binary Tree Right Side View.

public class LeetCode199 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(7);
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.left.right = new Node(5);
//        tree.root.right = new Node(3);
//        tree.root.right.right = new Node(4);

        System.out.print(tree.rightSideView(tree.root));
    }
}
class BTree{
    Node root;

    public List<Integer> rightSideView(Node root){
        List<Integer> list = new ArrayList<>();
        revers(root,list,0);
        return list;
    }
    public void revers(Node root,List<Integer> ans,int count){
        if(root == null){
            return;
        }
        if(count == ans.size()){
            ans.add(root.data);
        }
        revers(root.right,ans,count+1);
        revers(root.left,ans,count+1);
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
