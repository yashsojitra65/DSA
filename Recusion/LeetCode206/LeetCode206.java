package Recusion.LeetCode206;
//09-05-2023
//206. Reverse Linked List.
public class LeetCode206 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.reverse();
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
        }
    }
    public void reverse() {
        head = reverseRecursive(head);
    }
    private Node reverseRecursive(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
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
