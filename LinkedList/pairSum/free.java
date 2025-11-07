package LinkedList.pairSum;

public class  free {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.pairSum(70);
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
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }
    public void pairSum(int sum) {
        Node left = head;
        Node right = head.next;

        while (left.data != right.data){
            if (left.data + right.data == sum){
                System.out.println(left.data + " + " + right.data + " = " + sum);
                return;
            } else if (sum > right.data && right.next != null) {
                right = right.next;
            }else {
                left = left.next;
            }
        }
        System.out.println("Not Fonud");
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

    Node prev;

    Node(int data){
        this.data = data;
    }
}