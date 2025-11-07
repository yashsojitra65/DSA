package Tree.Inorder;

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

        System.out.println(tree.InOrder(tree.root));
    }
}
class BTree{
    Node root;
    public List<Integer> InOrder(Node root){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }else {
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                list.add(node.data);
                node = node.right;
            }
        }
        return list;
    }
}
class Node{
    int data;
    Node left;
    Node right;

    Node (int data){
        this.data = data;
    }
}
