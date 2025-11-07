package LinkedList.LeetCode234;
//27-03-2023
//234. Palindrome Linked List.
import java.util.*;
public class linkedlist234 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(10);
        //list.insert(40);
        System.out.println(list.isPalindrome(list.head.data));
        list.print();
    }
}
class LinkedList{
    Node head;
    Node tail;

    LinkedList(){
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean isPalindrome(int data) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while (temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }
        return checkPalindrome(arr);
    }

    private boolean checkPalindrome(ArrayList<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;

        while (left < right){
            if(arr.get(left) != arr.get(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
