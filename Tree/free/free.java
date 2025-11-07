package Tree.free;
import java.util.*;

public class free {
    public static void main(String[] args) {
        BTree tree = new BTree();
    }
}
class BTree{
    Node root;
}
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

