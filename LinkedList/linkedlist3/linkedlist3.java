package LinkedList.linkedlist3;
import java.util.Stack;
public class linkedlist3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.print();
        list.printReverse();
        list.countNode();
        list.length();
        list.getNNode(4);
        list.getEndNode(1);
    }
}
class LinkedList{   
    Node head;
    Node tail;

    int totalNode = 0;
    public LinkedList(){
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }
    public void countNode() {
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("Count nodes: " + count);
    }
    public void length() {
        Node temp = head;

        while (temp != null){
            totalNode++;
            temp = temp.next;
        }
        System.out.println("Total Nodes In LinkedList is: " + totalNode);
    }
    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void printReverse() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }

//        Node current = tail;
//        do{
//            System.out.print(current.data + " ");
//            Node temp = head;
//            while (temp.next != current){
//                temp = temp.next;
//            }
//            current = temp;
//        }while (current != head);
//        System.out.print(head.data + " ");
        System.out.println();
    }

    public void getNNode(int value) {
        Node temp = head;
        int count = 0;

        while (temp != null){
            count++;
            if(count == value){
                System.out.print("Get nth node in linked list: " + temp.data + " ");
                break;
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void getEndNode(int value) {
        if(value > totalNode){
            System.out.println("Enter Correct Position..!!");
            return;
        }
        Node temp = head;
        for (int i=0;i<totalNode-value;i++){
            temp = temp.next;
        }
        System.out.println("Get nth node from end in linked linked list: " + temp.data);
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
