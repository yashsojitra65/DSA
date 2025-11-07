//10-04-2023
//4.Insert value in sorted way in a sorted doubly linked list.
package LinkedList.InsertSortedway;
public class InsertSortedway {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        list.insert(15);
        list.insert(24);
        list.insert(30);
        list.insert(50);

        list1.head = list.sortedInsert(list.head,20);   
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
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public Node sortedInsert(Node head, int value) {
        Node node = new Node(value);
        Node temp = head;

        if(temp == null || temp.data >= node.data){
            node.next = temp;
            return node;
        }
        while (temp.next != null && temp.next.data < node.data){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

        return head;
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}