package LeetCode;
import java.util.*;
//06-11-2025
//3663. Find The Least Frequent Digit.
public class LeetCode3663 {
    public static void main(String[] args) {
        int n = 6556;
        int max = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        while (n != 0){
            int num = n % 10;
            map.put(num, map.getOrDefault(num,0) + 1);
            n /= 10;
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if (m.getValue() < max) {
                ans = m.getKey();
                max = m.getValue();
            }
        }
        System.out.println(ans);
    }
}
