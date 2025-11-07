package LinkedList.LeetCode2130;
//17-05-2023
//2130. Maximum Twin Sum of a Linked List.
public class LeetCode2130 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(2);
        list.insert(1);
        list.print();
        System.out.println(list.pairSum(list.head));
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
    public int pairSum(Node head){
       Node fast = head;
       Node slow = head;
       int maxVal = 0;
       while (fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
       }
       Node temp,prev = null;
        while (slow != null){
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while (prev != null){
            maxVal = Math.max(maxVal,head.data + prev.data);
            prev = prev.next;
            head = head.next;
        }
        return maxVal;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
