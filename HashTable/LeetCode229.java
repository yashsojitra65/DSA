package HashTable;

import java.util.*;
//18-05-2023
//229. Majority Element II.
public class LeetCode229 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mep = new HashMap<>();

        for(int i : arr){
            if(mep.containsKey(i)){
                mep.put(i,mep.get(i) + 1);
            }else {
                mep.put(i,1);
            }
        }
        System.out.println(mep);
        int n = arr.length / 3;

        for(Map.Entry<Integer,Integer> me : mep.entrySet()){
            if(me.getValue() > n){
                ans.add(me.getKey());
            }
        }
        System.out.println(ans);
    }
}
