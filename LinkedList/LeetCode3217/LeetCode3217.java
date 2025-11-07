package LinkedList.LeetCode3217;
import java.util.*;
//07-11-2025
//3217. Delete Nodes From Linked List Present in Array.
public class LeetCode3217 {
    public static void main(String[] args) {
        int[] arr = {1};
        Node node = new Node(1);
        Node head = node;
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        Node ans = modifiedList(arr,head);

        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }

    private static Node modifiedList(int[] arr, Node node) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }

        while (node != null && set.contains(node.data)){
            node =  node.next;
        }
        Node head = node;

        if (node == null) return null;

        Node temp = node;
        while (temp.next != null){
            if(set.contains(temp.next.data)){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }

        return head;
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}