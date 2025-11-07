package HashTable;
import java.util.*;

public class LeetCode974 {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        for(int i : arr){
            sum += i;
            int rem = (sum % k + k) % k;
            ans += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        System.out.print(ans);
    }
}
