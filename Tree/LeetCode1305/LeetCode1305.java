package Tree.LeetCode1305;
import java.util.*;
//07-06-2023
//1305.All Elements in Two Binary Search Trees.
public class LeetCode1305 {
    public static void main(String[] args) {
        Node node1 = new Node(2);
        node1.left = new Node(1);
        node1.right = new Node(4);

        Node node2 = new Node(1);
        node2.left = new Node(0);
        node2.right = new Node(3);

        System.out.println(getAllElements(node1,node2));
    }
    public static List<Integer> getAllElements(Node root1, Node root2) {
        List<Integer> list = new ArrayList<>();
        helper(root1,list);
        helper(root2,list);

        Collections.sort(list);
        return list;
    }
    private static void helper(Node root,List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);
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
