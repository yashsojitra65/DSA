package LeetCode;

import java.util.*;
public class LeetCode1833 {
    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;

        int sum = 0;
        int count = 0;
        Arrays.sort(costs);

        for(int i=0; i<costs.length; i++){
            sum += costs[i];
            count++;

            if(sum == coins){
                System.out.println(count);
                return;
            }
            if(sum > coins){
                System.out.println(count - 1);
                return;
            }
        }
        System.out.println(count);
    }
}
