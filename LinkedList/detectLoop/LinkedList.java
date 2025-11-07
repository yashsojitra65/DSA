package LinkedList.detectLoop;

public class LinkedList {
    Node head;
    Node tail;
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.tail.next = list.head.next;

//        System.out.println(list.loopDetect());
        System.out.println(list.loopNodeCount());
        list.print();
    }

    private int loopNodeCount() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        int count = 1;
        fast = fast.next;
        while (fast != slow){
            count++;
            fast = fast.next;
        }
        return count;
    }

    private boolean loopDetect() {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    private void print() {
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private void insert(int data) {
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

}
class Node {
    int data;
    Node next;

    Node(int data){
        this.data =data;
    }
}
