package Tree.LeetCode671;
import java.util.*;
//06-06-2023
//671.Second Minimum Node In a Binary Tree

public class LeetCode671 {
    public static void main(String[] args) {
        Node node = new Node(2);
        node.left = new Node(2);
        node.right = new Node(5);
        node.right.left = new Node(5);
        node.right.right = new Node(7);

        // System.out.print(findSecondMinimumValue(node));
         System.out.print(findSecondMinimumValue1(node));
        //System.out.print(findSecondMinimumValue2(node));
    }

//    private static int findSecondMinimumValue2(Node node) {
//        TreeSet<Integer> set = new TreeSet<>();
//        helper(node, set);
//        int ans = -1, idx = 0;
//        for (int i : set) {
//            if (idx == 2) {
//                break;
//            }
//            ans = i;
//            idx++;
//        }
//        return set.size() == 1 ? -1 : ans;
//    }
//
//    private static void helper(Node root, TreeSet<Integer> set) {
//        if (root == null) {
//            return;
//        }
//        set.add(root.data);
//        helper(root.left, set);
//        helper(root.right, set);
//    }

    static long first = Long.MAX_VALUE, second = Long.MAX_VALUE;
    private static int findSecondMinimumValue1(Node root) {
        if (root == null){
            return 1;
        }
        findMin(root);
        findMin1(root, first);
        return (int)second;
    }

    private static void findMin1(Node root, long first) {
        if (root == null){
            return;
        }
        if (root.data != first) {
            second = Math.min(second, root.data);
        }
        findMin1(root.left, first);
        findMin1(root.right, first);
    }

    private static void findMin(Node root) {
        if (root == null) {
            return;
        }
        first = Math.min(first, root.data);
        findMin(root.left);
        findMin(root.right);
    }

//    private static int min(Node root){
//        if(root == null){
//            return 0;
//        }
//        int sum = 0;
//        if(root.left == null){
//            sum = root.data;
//        }else {
//            sum =  Math.min(root.data,root.left.data);
//        }
//        min(root.left);
//        return sum;
//    }
//    private static int min1(Node root){
//        if(root == null){
//            return 0;
//        }
//        int sum = 0;
//        if(root.right == null){
//            sum = root.data;
//        }else {
//            sum =  Math.min(root.data,root.left.data);
//        }
//        min(root.right);
//        return sum;
//    }
//    public static int findSecondMinimumValue(Node root) {
//        if(root == null){
//            return 0;
//        }
//        int sum1 = min(root.left);
//        int sum2 = min1(root.right);
//        if(sum1 != sum2){
//            return Math.max(sum1,sum2);
//        }
//        return -1;
//    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
