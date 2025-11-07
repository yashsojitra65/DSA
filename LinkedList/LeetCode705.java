package LinkedList;

public class LeetCode705 {
    public static void main(String[] args) {
        MyHashSet list = new MyHashSet();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.remove(3);
        System.out.println(list.contains(2));
        list.print();
    }
}
class MyHashSet{
    Node head;
    Node tail;
    public MyHashSet(){
        head=null;
        tail=null;
    }
    public void add(int key){
        Node node = new Node(key);
        if (head == null){
            head = node;
            tail = node;
        }else{
            Node n1 = head;
            Boolean flag = true;
            while (n1 != null){
                if (n1.data == key){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
                n1 = n1.next;
            }
            if (flag){
                tail.next = node;
                tail = node;
            }
        }
    }
    public void remove(int key){
        if (head != null && head.data == key){
            head = head.next;
        } else if (tail != null && tail.data == key) {
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;

        }else{
            Node temp = head;
            while (temp != null && temp.next != null){
                if (temp.next.data == key){
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
        }
    }
    public boolean contains(int key) {
        Node temp = head;
        Boolean flag = false;

        while (temp != null){
            if (temp.data == key){
                flag = true;
                break;
            }else {
                flag = false;
            }
            temp = temp.next;
        }
        if (flag == true){
            return true;
        }else{
            return false;
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

    Node(int data){
        this.data = data;
    }
}