package LinkedList.LeetCode92;
//19-04-2023
//92. Reverse Linked List II.
import java.util.Stack;
public class LeetCode92 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.reverseBetween(list.head,2,4);
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

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reverseBetween(Node head, int left, int right) {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        while (temp != null) {
            if (count == left) {
                break;
            }
            temp = temp.next;
            count++;
        }
        Node temp1 = temp;
        while (left <= right) {
            stack.push(temp1.data);
            temp1 = temp1.next;
            left++;
        }
        while (!stack.isEmpty()) {
            temp.data = stack.peek();
            temp = temp.next;
            stack.pop();
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
