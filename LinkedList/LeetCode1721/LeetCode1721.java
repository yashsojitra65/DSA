package LinkedList.LeetCode1721;
//13-04-2023
//1721. Swapping Nodes in a Linked List.
public class LeetCode1721 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list1.head = list.swapping(list.head,2);
        list1.print();
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

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public Node swapping(Node head,int k) {
        Node fast = head;
        Node slow = head;
        Node first = null;
        Node second = null;

        for(int i=1; i<k; i++){
            fast = fast.next;
        }
        first = fast;
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        second = slow;
        int temp = second.data;
        second.data = first.data;
        first.data = temp;

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