//17-04-2023
//707. Design Linked List.
package LinkedList.LeetCode707;

public class LeetCode707 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1,2);
        list.get(1);
        list.deleteAtIndex(1);
        list.get(1);
        list.print();
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size = 0;
    LinkedList(){
        head = null;
        tail = null;
    }
    public void addAtHead(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void addAtTail(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void addAtIndex(int index,int value){
        if(index == 0){
            addAtHead(value);
        } else if (index == size) {
            addAtTail(value);
        }else {
            Node temp = head;
            Node prev = null;
            for(int i=0; i<index; i++){
                prev = temp;
                temp = temp.next;
            }
            Node node = new Node(value);
            prev.next = node;
            node.next = temp;
            size++;
        }
    }
    public void deleteAtIndex(int index){
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
        }else {
            Node temp = head;
            Node prev = null;
            for(int i=0; i<index; i++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            if(prev.next == null){
                tail = prev;
            }
        }
        size--;
    }
    public int get(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.data;
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
