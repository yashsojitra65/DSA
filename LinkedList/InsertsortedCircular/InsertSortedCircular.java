package LinkedList.InsertsortedCircular;

public class InsertSortedCircular {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list1.head = list.insertSorted(list.head,35);
        list1.print();
    }
}
class LinkedList{
    Node head;
    Node tail;

    LinkedList(){
        head = null;
        tail = null;
    }

    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public Node insertSorted(Node head,int value){
        Node node = new Node(value);
        Node temp = head;

        if(temp == null){
            node.next = node;
            return node;
        }else if (temp.data >= node.data){
            while (temp.next != head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
            return node;
        }else {
            while (temp.next != head && temp.next.data < node.data){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        return head;
    }

    public void print(){
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while (temp != head);
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
