package Tree.PostOrder;

import java.util.*;
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

        System.out.println(tree.postOrder(tree.root));
    }
}
class BTree{
    Node root;
    public List<Integer> postOrder(Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        if(root == null){
            return list;
        }
        stack1.push(root);
        while (!stack1.isEmpty()){
            root = stack1.pop();
            stack2.add(root);
            if(root.left != null){
                stack1.push(root.left);
            }
            if(root.right != null){
                stack1.push(root.right);
            }
        }
        while (!stack2.isEmpty()){
            list.add(stack2.pop().data);
        }
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
