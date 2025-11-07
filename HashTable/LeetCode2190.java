package HashTable;

import java.util.*;
//17-05-2023
//2190. Most Frequent Number Following Key In an Array.
public class LeetCode2190 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        int k = 2;

        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] == k) {
                map.put(arr[i + 1], map.getOrDefault(arr[i + 1], 0) + 1);
            }
        }
        System.out.println(map);
        int count = 0;
        int max = 0;
        for(Map.Entry<Integer,Integer> me : map.entrySet()){
            if(me.getValue() > count){
                count = me.getValue();
                max = me.getKey();
            }
        }
        System.out.println(max);
    }
}
