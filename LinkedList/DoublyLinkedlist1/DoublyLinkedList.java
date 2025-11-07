//04-04-2023.
//Get middle node from a doubly linked list with two pointer.
package LinkedList.DoublyLinkedlist1;

public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        //list.insert(50);
        list.middle();
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
    public void middle(){
        Node left = head;
        Node right = tail;

        while (left != null && right != null){
            if(left == right){
                break;
            }
            if(left.next == right && right.prev == left){
                break;
            }else {
                left = left.next;
                right = right.prev;
            }
        }
        System.out.println(left.data);
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

