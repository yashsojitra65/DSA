package Stack_Queue;
import java.util.*;
//15-08-2023
//1005.Maximize Sum Of Array After K Negations.
public class LeetCode1005 {
    public static void main(String[] args) {
        int[] arr = {4,2,3};
        int k = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n : arr){
            pq.add(n);
        }
        while(k > 0) {
            int val = pq.poll();
            pq.add(-val);
            k--;
        }
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        System.out.print(sum);
    }
}
