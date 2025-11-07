package Tree.LeetCode653;
import java.util.*;
//03-07-2023
//653.Two Sum IV - Input is a BST.
public class LeetCode653 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.right = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.print(tree.findTarget(tree.root,5));
    }
}
class BST{
    Node root;
    public boolean findTarget(Node root,int k){
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        int i = 0;
        int j = list.size() - 1;

        while (i < j){
            int sum = list.get(i) + list.get(j);
            if(sum == k){
                return true;
            } else if (k < sum) {
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
    public List<Integer> helper(Node root,List<Integer> list){
        if(root == null){
            return null;
        }
        helper(root.left,list);
        list.add(root.data);
        helper(root.right,list);
        return list;
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
