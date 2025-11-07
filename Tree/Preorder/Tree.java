package Tree.Preorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.left.left = new Node(50);
        tree.root.left.left.right = new Node(60);
        tree.root.left.right = new Node(70);
        tree.root.right.left = new Node(80);

        System.out.println(tree.preorder(tree.root));
    }
}
class BTree{
     Node root;

     public List<Integer> preorder(Node root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            root = stack.pop();
            list.add(root.data);
            if(root.right  != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return list;
     }
}
class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
