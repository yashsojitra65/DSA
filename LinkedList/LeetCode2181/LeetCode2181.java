//10-04-2023
//2181. Merge Nodes in Between Zeros.

package LinkedList.LeetCode2181;
public class LeetCode2181 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(0);
        list.insert(1);
        list.insert(0);
        list.insert(3);
        list.insert(0);
        list.insert(2);
        list.insert(2);
        list.insert(0);
        list.Marge();
        list.print();
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
    public void Marge(){
        Node temp = head;
        Node temp1 = head;
        int sum = 0;
        int count = 0;

        while (temp != null){
            if(temp.data == 0 && head != temp){
                if(count == 0){
                    head = temp;
                    temp1 = head;
                    temp1.data = sum;
                    sum = 0;
                    count++;
                }else {
                    temp.data = sum;
                    temp1.next = temp;
                    sum = 0;
                    temp1 = temp1.next;
                }
            }else {
                sum += temp.data;
            }
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
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
