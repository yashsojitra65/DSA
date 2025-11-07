package HashTable;

import java.util.*;
//03-05-2023
//1512. Number of Good Pairs.
public class LeetCode1512 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
        int count = 0;
        for(int i : map.values()){
            count = count + i * (i - 1)/2;
        }
//        for(Map.Entry<Integer,Integer> me : map.entrySet()){
//            count = count + (me.getValue() * (me.getValue() - 1))/2;
//        }
        System.out.println(count);
    }
}
