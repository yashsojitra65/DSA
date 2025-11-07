package LinkedList.LeetCode61;
//01-08-2023
//61.Rotate List.
public class LeetCode61 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList ans = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        int k = 2;
        ans.head = list.rotateRight(list.head,k);
        ans.print();
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
    public Node rotateRight(Node head,int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int i = 1;
        Node temp = head;
        while (temp.next != null){
            i++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % i;
        k = i - k;
        while (k > 0){
            temp = temp.next;
            k--;
        }
        head = temp.next;
        temp.next = null;
        return head;
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
