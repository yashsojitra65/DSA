package LinkedList.LeetCode;

public class LeetCode203 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(6);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.removeDuplicate(6);
        list.print();
    }
}
class LinkedList {
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

    public void removeDuplicate(int value){
        while (head != null && head.data == value){
            head = head.next;
        }
        Node temp = head;
        Node curr = null;

        while (temp != null){
            if(temp.data == value){
                curr.next = temp.next;
            }else {
                curr = temp;
            }
            temp = temp.next;
        }

//        while (temp.next != null){
//            if (temp.next.data == value){
//                temp.next = temp.next.next;
//            }else {
//                temp = temp.next;
//            }
//        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
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
