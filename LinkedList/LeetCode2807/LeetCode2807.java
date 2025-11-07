package LinkedList.LeetCode2807;
//29-12-2023
//2807.Insert Greatest Common Divisors in Linked List.
public class LeetCode2807 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(6);
        list.insert(10);
        list.insert(3);

        list.insertGreatestCommonDivisors(list.head);
        list.print();
    }
}

class LinkedList {
    Node head;
    Node tail;

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

    public int getGCD(int a, int b) {
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }


    public void insertGreatestCommonDivisors(Node head) {
        Node temp = head;

        while (temp != null && temp.next != null) {
            Node node = new Node(getGCD(temp.data, temp.next.data));
            node.next = temp.next;
            temp.next = node;

            temp = temp.next.next;
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
