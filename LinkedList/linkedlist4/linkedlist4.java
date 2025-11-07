package LinkedList.linkedlist4;

public class linkedlist4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.deleteNode(list.head.next);
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
        }else{
            tail.next = node;
            tail = node;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void deleteNode(Node p) {
        Node temp = p;
        temp.data = temp.next.data;
        temp.next = temp.next.next;

//        while (temp.next != null){
//            temp.data = temp.next.data;
//            if (temp.next.next == null){
//                temp.next = null;
//                return;
//            }
//            temp = temp.next;
//        }
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
