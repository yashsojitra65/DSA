package HashTable;

import java.util.HashMap;
//18-05-2023
//1218. Longest Arithmetic Subsequence of Given Difference.
public class LeetCode1218 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int difference = 1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i]-difference,0) + 1);
        }

        System.out.println(map);
        int ans = 1;
        for(int i : map.values()){
            ans = Math.max(i,ans);
        }
        System.out.println(ans);
    }
}
