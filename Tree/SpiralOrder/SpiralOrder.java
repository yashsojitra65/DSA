package Tree.SpiralOrder;

import java.security.PublicKey;
import java.util.Deque;
import java.util.LinkedList;

public class SpiralOrder {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.Spiral();
    }
}
class BTree{
    Node root;
    public void Spiral(){
        Boolean flag = false;
        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            if (flag) {
                int size = deque.size();
                while (size > 0) {
                    Node node = deque.removeLast();
                    System.out.print(node.data + " ");
                    if(node.right != null){
                        deque.addFirst(node.right);
                    }
                    if(node.left != null){
                        deque.addFirst(node.left);
                    }
                    size--;
                }
                flag = !flag;
            }else {
                int size = deque.size();
                while (size > 0){
                    Node node = deque.removeFirst();
                    System.out.print(node.data + " ");
                    if(node.left != null){
                        deque.addLast(node.left);
                    }
                    if(node.right != null){
                        deque.addLast(node.right);
                    }
                    size--;
                }
                flag = !flag;
            }
        }
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
