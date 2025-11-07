package LinkedList.ReverseSingly;

public class ReverseSingly {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.revers();
        list.print(list.head);
    }
}
class LinkedList {
    Node head = null;
    Node tail = null;
    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }
    public void revers(){
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node curr = temp;
            temp = temp.next;
            curr.next = prev;
            prev = curr;
        }
        head = prev;
    }
    public void print(Node head){
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

    Node(int data){
        this.data = data;
    }
}
