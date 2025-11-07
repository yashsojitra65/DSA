package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
//10-03-2023
//225. Implement Stack using Queues.
public class LeetCode225 {
    public static void main(String[] args) {
        LeetCode225 leet = new LeetCode225();

        System.out.println(leet.push(1));
        System.out.println(leet.push(2));
        System.out.println(leet.peek());
        System.out.println(leet.pop());
        System.out.println(leet.empty());
    }

    private boolean empty() {
        return q1.isEmpty();
    }

    private int pop() {
        return q1.poll();
    }

    private int peek() {
        return q1.peek();
    }
    Queue<Integer> q1;
    Queue<Integer> q2;

    public LeetCode225(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    String push(int i) {
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(i);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
       return null;
    }
}
