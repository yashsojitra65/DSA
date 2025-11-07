//04-04-2023
// Create, insert, delete, print doubly linked list.
package LinkedList.DoublyLinkedlist;

public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.delete(20);
        list.print();
        list.printRev();
    }
}
class LinkedList{
    Node head;
    Node tail;

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            node.prev = tail;
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
    public void printRev(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
    public void delete(int data){
        if(head.data == data){
            head = head.next;
            if(head != null){
                head.prev = null;
            }else {
                head = null;
                tail = null;
            }
        } else if (tail.data == data) {
            Node temp = tail.prev;
            temp.next = null;
            tail = temp;
            //tail.prev = null;
        }else {
            Node temp = head;
            while (temp.data != data){
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            //temp.next = null;
            //temp.prev = null;
        }
    }
}

class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
