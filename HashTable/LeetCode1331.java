package HashTable;

import java.util.*;
//16-05-2023
//1331.Rank Transform of an Array.
public class LeetCode1331 {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] ans = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            ans[i] = arr[i];
        }
        Arrays.sort(ans);

        for(int i : ans){
            if(!map.containsKey(i)){
                map.put(i,map.size() + 1);
            }
        }
        System.out.println(map);
        for(int i=0;i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
