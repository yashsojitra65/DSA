package Tree.LeetCode1022;
//29-05-2023
//1022. Sum of Root To Leaf Binary Numbers.
public class LeetCode1022 {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(1);
        tree.root.left = new Node(0);
        tree.root.left.left = new Node(0);
        tree.root.left.right = new Node(1);
        tree.root.right = new Node(1);
        tree.root.right.left = new Node(0);
        tree.root.right.right = new Node(1);

        System.out.print(tree.sumRootToLeaf(tree.root));
    }
}
class BTree{
    Node root;
    private int TotalSum = 0;
    public int sumRootToLeaf(Node root){
        if(root == null){
            return 0;
        }
        TotalLeaf(root,0);
        return TotalSum;
    }
    private void TotalLeaf(Node root,int sum){
        if(root == null){
            return;
        }
        sum = sum + root.data;
        if(root.left == null && root.right == null){
            TotalSum += sum;
        }
        TotalLeaf(root.left,sum*2);
        TotalLeaf(root.right,sum*2);
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