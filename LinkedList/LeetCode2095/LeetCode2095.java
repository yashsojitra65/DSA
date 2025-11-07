//28-03-2023
//2095. Delete the Middle Node of a Linked List.
package LinkedList.LeetCode2095;
public class LeetCode2095 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(4);
        list.insert(7);
        list.insert(1);
        list.insert(2);
        list.insert(6);
        list.midNode(list.head);
        list.print();
    }
}
class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
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
    public void midNode(Node p){
        Node fast = p;
        Node slow = p;
        Node prevSlow = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }

        if (prevSlow != null) {
            prevSlow.next = slow.next;
        }

//        while (fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        Node temp = head;
//
//        while (temp != null){
//            if(temp.next.data == slow.data){
//                temp.next = temp.next.next;
//                return;
//            }
//            temp = temp.next;
//        }
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