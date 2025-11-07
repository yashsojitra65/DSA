package LinkedList.linkedlist1;
import java.util.*;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedL list = new LinkedL();

        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(70);
        list.insert(30);
        list.insert(90);
        list.insert(80);
        list.insert(0);
//        list.update(20,200);
        list.delete(30);
        list.print();
    }
}

class LinkedL{
    Node head;
    Node tail;

    LinkedL(){
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

    public void update(int old, int newValue) {
        Node temp = head;
        while (temp != null){
            if(temp.data == old){
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void delete(int data) {
        if(head.data == data){
            head = head.next;
        }else {
            Node temp = head;
            while (temp != null){
                if(temp.next.data == data){
                    if(temp.next == tail){
                        temp.next = null;
                        tail = temp;
                        return;
                    }else {
                        temp.next = temp.next.next;
                        return;
                    }
                }
                temp = temp.next;
            }
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