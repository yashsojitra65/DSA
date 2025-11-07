package LinkedList.LeetCode328;
//25-04-2023
//328. Odd Even Linked List.
public class LeetCode328 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(6);
        list.insert(4);
        list.insert(7);
        list.oddEvenList(list.head);
        list.print();
    }
}
class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public void oddEvenList(Node head) {
        Node odd = head;
        Node even = head.next;
        Node evenStart = head.next;

        while (odd != null && even != null && even != null){
            odd.next = even.next;
            even.next = odd.next.next;
            odd.next.next = evenStart;

            odd = odd.next;
            even = even.next;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
