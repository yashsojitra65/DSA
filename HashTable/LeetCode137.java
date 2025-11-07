package HashTable;

import java.util.*;
//04-07-2023
//137.Single Number II
public class LeetCode137 {
    public static void main(String[] args) {
        int nums[] = {2,2,3,2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else {
                map.put(i,1);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }
}
