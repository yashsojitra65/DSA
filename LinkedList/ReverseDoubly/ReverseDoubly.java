//10-04-2023
//3. Reverse a Doubly Linked List.
package LinkedList.ReverseDoubly;

public class ReverseDoubly {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.printReverse(list.head);
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
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    public void printReverse(Node head) {
        Node temp = head;
        Node curr = null;

        while (temp != null) {
            curr = temp.prev;
            temp.prev = temp.next;
            temp.next = curr;

            curr = temp;
            temp = temp.prev;
        }
        head = curr;
        tail = head;
//
//        while (newHead != null) {
//            System.out.print(newHead.data + " ");
//            newHead = newHead.next;
//        }
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }
}
