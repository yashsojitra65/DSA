//11-04-2023
//2. Find pairs with given sum in sorted doubly linked list.
package LinkedList.FindPairs;
public class FindParis {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(5);
        list.insert(8);
        list.insert(10);
        list.insert(12);
        list.paris(18);
    }
}
class LinkedList{
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
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
    }

    public void paris(int sum) {
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right){
            if(left.data + right.data == sum){
                System.out.print(left.data + " " + right.data);
                return;
            } else if (left.data + right.data < sum) {
                left = left.next;
            }else {
                right = right.prev;
            }
        }
        System.out.print("Pairs is not found..");
    }
}
class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
    }
}
