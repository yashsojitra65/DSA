//11-04-2023
//21. Merge Two Sorted Lists.
package LinkedList.LeetCoed21;
import java.util.*;
public class LeetCode21 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node head1 = node1;
        Node head2 = node2;
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head2.next = new Node(3);
        head2.next.next = new Node(4);
        margeTwoSorted(head1,head2);
    }
    public static void margeTwoSorted(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        LinkedList<Integer> list = new LinkedList<>();

        while (true) {
            if(temp1 == null){
                list.add(temp2.data);
                break;
            }
            if(temp2 == null){
                list.add(temp1.data);
                break;
            }
            if (temp1.data <= temp2.data) {
                list.add(temp1.data);
                temp1 = temp1.next;
            } else {
                list.add(temp2.data);
                temp2 = temp2.next;
            }
        }
        System.out.println(list);
    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
