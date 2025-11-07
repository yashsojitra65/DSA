//28-03-2023.
//Exchange first and last nodes in Circular Linked List
package LinkedList.CircularLinkedList1;

public class CircularLinkedList2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.change();
        list.print();
    }
}
class LinkedList{
    Node head;
    Node temp;

    LinkedList(){
        head = null;
        temp = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            temp = node;
        } else {
            temp.next = node;
            temp = node;
            temp.next = head;
        }
    }

    public void print() {
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != head);
    }

    public void change() {
        int first = head.data;
        head.data = temp.data;
        temp.data = first;
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}

