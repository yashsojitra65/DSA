package LeetCode;

import java.util.*;

public class LeetCode373 {
    public static void main(String[] args) {
        int[] num1 = {1,7,11};
        int[] num2 = {2,4,6};
        int k = 3;

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(
                (a,b) -> (b.get(0) + b.get(1)) - (a.get(0) + a.get(1))
        );

        for(int i=0; i<num1.length; i++){
            for(int j=0; j<num2.length; j++){
                pq.add(Arrays.asList(num1[i],num2[j]));
                if(pq.size() > k){
                    pq.poll();
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        while (k > 0 && !pq.isEmpty()){
            list.add(pq.poll());
            k--;
        }
        System.out.println(list);
    }
}
