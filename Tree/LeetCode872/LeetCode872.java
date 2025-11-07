package Tree.LeetCode872;
import java.util.*;
//05-06-2023
//872.Leaf-Similar Trees.
public class LeetCode872 {
    public static void main(String[] args) {
        Node root1 = new Node(3);
        root1.left = new Node(5);
        root1.right = new Node(1);
        root1.left.left = new Node(6);
        root1.left.right = new Node(2);
        root1.right.left = new Node(9);
        root1.right.right = new Node(8);
        root1.left.right.left = new Node(7);
        root1.left.right.right = new Node(4);

        Node root2 = new Node(3);
        root2.left = new Node(5);
        root2.left.left = new Node(6);
        root2.left.right = new Node(7);
        root2.right = new Node(1);
        root2.right.left = new Node(4);
        root2.right.right = new Node(2);
        root2.right.right.left = new Node(9);
        root2.right.right.right = new Node(8);

        System.out.print(leafSimilar(root1, root2));
    }
    public static boolean leafSimilar(Node root1, Node root2){
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        tree(queue1,root1);
        tree(queue2,root2);

        if(queue1.equals(queue2)){
            return true;
        }
        return false;
    }
    private static Queue<Integer> tree(Queue<Integer> queue,Node root){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right == null){
            queue.add(root.data);
        }
        tree(queue,root.left);
        tree(queue,root.right);
        return queue;
    }
}
class  Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
