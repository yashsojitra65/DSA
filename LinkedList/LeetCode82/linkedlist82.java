//27-03-2023
//83. Remove Duplicates from Sorted List.
package LinkedList.LeetCode82;
public class linkedlist82 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.insert(4);
        list.insert(5);
        list1.head = list.deleteDuplicates(list.head);
        list1.print();
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

    public Node deleteDuplicates(Node head) {
        Node curr = new Node(0);
        curr.next = head;
        Node temp2 = curr;
        Node temp = head;

        while (temp != null){
            while (temp.next != null && temp.data == temp.next.data){
                temp = temp.next;
            }
            if(temp2.next == temp){
                temp2 = temp2.next;
            }else{
                temp2.next = temp.next;
            }
            temp = temp.next;
        }

        return curr.next;
//        while (temp != null){
//            if((temp.next != null) && (fast.data == slow.data)){
//                temp.next = fast.next;
//                temp = temp.next;
//            }
//            fast = fast.next;
//            slow = slow.next;
//        }

//        while (temp != null){
//            if((temp.next != null) && (temp.data == temp.next.data)){
//                //temp.data = temp.next.data;
//                temp.next = temp.next.next;
//            }else {
//                temp = temp.next;
//            }
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
