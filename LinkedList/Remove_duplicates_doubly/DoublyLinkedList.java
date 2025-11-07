package LinkedList.Remove_duplicates_doubly;

import java.util.HashSet;
public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(20);
        list.delete();
        list.print();
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

    public void delete() {
        Node temp = head;
        HashSet<Integer> set = new HashSet<>();

        while (temp != null){
            if(set.contains(temp.data)){
                if(temp.next != null){
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }else{
                    temp.prev.next = null;
                }
            }else {
                set.add(temp.data);
            }
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
    }
}
