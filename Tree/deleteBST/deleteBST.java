package Tree.deleteBST;
import java.util.*;

public class deleteBST {
    public static void main(String[] args) {
        int arr[] = {8,5,12,10,13,2,7,1,3,4,6,8};
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
        root = deleteNode(root, 5);
        levelOrderTree(root);
        System.out.println();
        inorder(root);
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static Node deleteNode(Node root, int val) {
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            if(root.left == null && root.right == null){
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node node = helper(root.right);
            root.data = node.data;
            root.right = deleteNode(root.right, node.data);
        }
        return root;
    }

    private static Node helper(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void levelOrderTree(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}