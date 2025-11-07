package LinkedList.LeetCode876;
//27-03-2023
//876. Middle of the Linked List.
public class linkedlist876 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        list.middleNode(list.head);
        list.print();
    }
}
class LinkedList{
    Node head;
    Node tail;

    LinkedList(){
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }
    public void middleNode(Node p){
        Node fast = p;
        Node slow = p;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
