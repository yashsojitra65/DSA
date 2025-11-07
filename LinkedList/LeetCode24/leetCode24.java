package LinkedList.LeetCode24;
//20-04-2023
//24. Swap Nodes in Pairs.
public class leetCode24 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.swapPairs();
        list.print();
    }
}
class LinkedList{
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

    public void swapPairs() {
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null){
            int i = slow.data;
            slow.data = fast.data;
            fast.data = i;
            fast = fast.next.next;
            slow = slow.next.next;
        }
        if(slow.next != null && slow != null){
            int k = slow.data;
            slow.data = fast.data;
            fast.data = k;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
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


