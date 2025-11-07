package LinkedList.LeetCode148;
//18-04-2023
//148.Sort List.
import java.util.*;
public class LeetCode148 {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Linkedlist list1 = new Linkedlist();
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.sortList(list.head);

        list.print();
    }
}
class Linkedlist {
    Node head;
    Node tail;

    Linkedlist() {
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

    public void sortList(Node head){
        Node temp = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (temp != null){
            arrayList.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(arrayList);
        temp = head;
        for(int i : arrayList){
            temp.data = i;
            temp = temp.next;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
