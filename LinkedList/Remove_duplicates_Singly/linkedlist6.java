package LinkedList.Remove_duplicates_Singly;

import java.util.HashSet;
public class linkedlist6 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(20);
        list.RemoveDuplicate();
        list.print();
    }
}
class LinkedList{
    Node head;
    Node tail;
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
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void RemoveDuplicate() {
        Node temp = head;
        Node curr = head;
        HashSet<Integer> set = new HashSet<>();

        while (temp != null){
            if(set.isEmpty()){
                set.add(temp.data);
            }else if (set.contains(temp.data)){
                if(curr.next != null){
                    curr.next = curr.next.next;
                }else {
                    curr.next = null;
                }
            }else {
                set.add(temp.data);
                curr = curr.next;
            }
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