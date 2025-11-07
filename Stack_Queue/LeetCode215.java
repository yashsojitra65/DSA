package Stack_Queue;
import java.util.*;
//14-08-2023
//215.Kth Largest Element in an Array.
public class LeetCode215 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i< arr.length; i++){
            if(pq.size() < k){
                pq.add(arr[i]);
            }else {
                if(pq.peek() < arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        System.out.println(pq.peek());
    }
}
