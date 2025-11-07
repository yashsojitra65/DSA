//18-04-2023
//2487. Remove Nodes From Linked List.
package LinkedList.LeetCode2487;

public class LeetCode2487 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(13);
        list.insert(3);
        list.insert(8);

        list1.head = list.removeNodes();
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
    public Node removeNodes() {
        Node temp = Cheack(head);
        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.next.data < curr.data) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
    public Node Cheack(Node temp){
        Node max = temp;
        int count = 0;
        int max1 = 0;
        while (temp != null && temp.next != null){
            if(temp.data < temp.next.data){
                count=temp.next.data;
            }
            if (max1<count){
                max1=count;
                max=temp.next;
            }
            temp = temp.next;
        }
        head=max;
        return head;
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