package LinkedList.LeetCode1019;
//20-04-2023
//1019. Next Greater Node In Linked List.
public class LeetCode1019 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(7);
        list.insert(4);
        list.insert(3);
        list.insert(5);
        list.nextLargerNodes(list.head);
        //list.print();
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
    public void nextLargerNodes(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        int i = 0;
        temp = head;
        int max = 0;
        while (temp != null){
            max = findMax(temp);
            if(max == temp.data){
                arr[i++] = 0;
            }else {
                arr[i++] = max;
            }
            temp = temp.next;
        }
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
    public int findMax(Node temp){
        Node temp1 = temp;
        int max = temp.data;

        while (temp1 != null){
            if(max < temp1.data){
                max = temp1.data;
                break;
            }
            temp1 = temp1.next;
        }
        return max;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
