package LinkedList.LeetCode445;
//10-04-2023
//445. Add Two Numbers II
public class LeetCode445 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        list1.insert(7);
        list1.insert(2);
        list1.insert(4);
        list1.insert(3);
        list2.insert(5);
        list2.insert(6);
        list2.insert(4);
        list3.head =  list3.addTwoNumbers(list1.head,list2.head);
        list3.print();
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
        }else{
            tail.next = node;
            tail = node;
        }
    }
    public Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        Node curr = null;

        while (temp != null){
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        return prev;
    }
    public Node addTwoNumbers(Node head1,Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        temp1 = reverse(temp1);
        temp2 = reverse(temp2);

        Node sum = null;
        int carry = 0;

        while (temp1 != null || temp2 != null || carry > 0){
            int newCarry = carry;

            if(temp1 != null){
                newCarry = newCarry + temp1.data;
            }
            if(temp2 != null){
                newCarry = newCarry + temp2.data;
            }
            carry = newCarry / 10;
            newCarry = newCarry % 10;

            Node node = new Node(newCarry);
            node.next = sum;
            sum = node;

//            if(temp1 != null){
//                temp1 = temp1.next;
//            }
//            if(temp2 != null){
//               temp2 = temp2.next;
//            }
        }
        return sum;
    }

    public void print() {
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
