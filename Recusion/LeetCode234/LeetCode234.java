package Recusion.LeetCode234;
//10-05-2023
//234. Palindrome Linked List.
public class LeetCode234 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);
//        list.insert(1);
        System.out.println(list.palindrome(list.head));
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
    Node temp;
    public boolean palindrome(Node head){
        if(head == null){
            return true;
        }
        if(temp == null){
            temp = head;
        }

       boolean ans = palindrome(head.next);
       if(head.data == temp.data){
           temp = temp.next;
       }else {
           ans = false;
       }
       return ans;
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
