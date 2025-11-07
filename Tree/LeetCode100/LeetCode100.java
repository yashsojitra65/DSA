package Tree.LeetCode100;
//27-05-2023
//100.Same Tree.
public class LeetCode100 {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
//        root1.right.left = new Node(4);
//        root1.right.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
//        root2.right.left = new Node(4);

        if (isIdentical(root1, root2)) {
            System.out.println("Two Trees are identical");
        }else{
            System.out.println("Two trees are non-identical");
        }
    }
    private static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null){
            return false;
        }
        return ((root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
    }
}
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}

