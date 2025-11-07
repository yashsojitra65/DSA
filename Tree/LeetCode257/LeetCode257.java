package Tree.LeetCode257;
import java.util.*;
//28-06-2023
//257. Binary Tree Paths.
public class LeetCode257 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);

        System.out.print(tree.binaryTreePaths(tree.root));
    }
}
class BTree{
    Node root;
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(Node root) {
        helper(root,"");
        return list;
    }
    public void helper(Node root, String ans) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            ans += root.data;
            list.add(ans);
        }
        ans += root.data + "->";
        helper(root.left, ans);
        helper(root.right, ans);
//        List<String> list = new ArrayList<>();
//
//        if(root == null){
//            return list;
//        }
//        if(root.left == null && root.right == null){
//            list.add(Integer.toString(root.data));
//            return list;
//        }
//        for(String s : binaryTreePaths(root.left)){
//            list.add(root.data + "->" + s);
//        }
//        for(String s : binaryTreePaths(root.right)){
//            list.add(root.data + "->" + s);
//        }
//        return list;
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
