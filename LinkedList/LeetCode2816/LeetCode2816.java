package LinkedList.LeetCode2816;

public class LeetCode2816 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(9);
        list.insert(9);
        list.insert(9);

        Node ans = list.doubleIt(list.head);
        list.print(ans);
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
    public Node doubleIt(Node head){
//        if(head.data > 4){
//            head = new Node(0,head);
//        }
//        for(Node node = head; node != null; node = node.next){
//            node.data = (node.data * 2) % 10;
//            if(node.next != null && node.next.data > 4){
//                node.data++;
//            }
//        }
        return head;
    }
    public void print(Node head){
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
