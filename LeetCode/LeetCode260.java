package LeetCode;
import java.util.*;
//04-11-2025
//260. Single Number III.
public class LeetCode260 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};

        int[] ans = new int[2];
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i ,map.getOrDefault(i,0) + 1);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                ans[j] = m.getKey();
                j++;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
