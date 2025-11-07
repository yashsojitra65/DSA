package Stack_Queue;
import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        push(5,q1,q2);
        push(10,q1,q2);
        print(q1);
        poll(q1);
        print(q1);
        push(15,q1,q2);
        push(30,q1,q2);
        poll(q1);
        print(q1);
    }

    private static void print(Queue<Integer> q1) {
        System.out.println(q1);
    }

    private static int poll(Queue<Integer>q1){
        return q1.poll();
    }
    private static String push(int x,Queue<Integer> q1,Queue<Integer> q2){
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return null;
    }
}
