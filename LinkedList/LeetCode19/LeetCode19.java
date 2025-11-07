package LinkedList.LeetCode19;
//20-04-2023
//19. Remove Nth Node From End of List.
public class LeetCode19 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.removeNthFromEnd(list.head,2);
        list.print();
    }
}
class LinkedList{
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
    public void removeNthFromEnd(Node head, int n) {
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        count = count - n + 1;
        temp = head;
        int sum = 1;
        while (temp != null){
            if(sum == count && temp == head){
                head = head.next;
            } else if (sum == count-1 && temp != null) {
                temp.next = temp.next.next;
            }
            sum++;
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
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
