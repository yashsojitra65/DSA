package Stack_Queue;
import java.util.*;
//15-08-2023
//2099.Find Subsequence of Length K With the Largest Sum.
public class LeetCode2099 {
    public static void main(String[] args) {
        int[] arr = {63,-74,61,-17,-55,-59,-10,2,-60,-65};
        int k = 9;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ans = new int[k];

        for(int i : arr){
            pq.add(i);
        }
        while (pq.size() > k){
            pq.poll();
        }
        for(int i=0; i<k; i++){
            ans[i] = pq.poll();
        }
        System.out.println(Arrays.toString(ans));
    }
}
