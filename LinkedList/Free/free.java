package LinkedList.Free;

public class free {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
//        list.update(30,60);
        list.print();
    }
}
class LinkedList{
    Node head;
    Node tail;

    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public void print() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != head);
    }

    public void update(int old, int newValue) {
        Node temp = head;
        do {
            if (temp.data == old){
                temp.data = newValue;
            }
            temp = temp.next;
        }while (temp != head);
    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}