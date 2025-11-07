package LinkedList.LeetCode203;
//30-03-2023
//203.Remove Linked List Elements.
public class linkedlist203 {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node head = node;
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);
        Node ans = removeDuplicates(head);

        while (ans != null){
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }

    private static Node removeDuplicates(Node p) {
        Node temp = p;
        while (temp != null){
            Node temp1 = temp.next;
            while (temp1 != null && temp.data == temp1.data){
                temp1 = temp1.next;
            }
            temp.next = temp1;
            temp = temp.next;
        }
        return p;
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
