package Recusion.LeetCode21;
//10-05-2023
//21. Merge Two Sorted Lists.
public class LeetCode21 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
        list3.head = list3.mergeTwoLists(list1.head,list2.head);
        list3.print();
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
        }
    }
    public Node mergeTwoLists(Node head1, Node head2){
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data < head2.data) {
            head1.next = mergeTwoLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeTwoLists(head1, head2.next);
            return head2;
        }
    }
    public void print(){
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
