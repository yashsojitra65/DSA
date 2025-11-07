package HashTable;

import java.util.*;
//11-05-2023
//2053. Kth Distinct String in an Array.
public class LeetCode2053 {
    public static void main(String[] args) {
        String[] s = {"d","b","c","b","c","a"};
        String ans = "";
        int k = 2;
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String i : s){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int count = 1;
        for(Map.Entry<String,Integer> me : map.entrySet()){
            if(me.getValue() == 1 && count == k){
                ans = me.getKey();
                break;
            }else if (me.getValue() == 1){
                count++;
            }
        }
        System.out.print(ans);

//        HashSet<String> set = new HashSet<>();
//
//        for(String i : s){
//            if(set.contains(i)){
//                set.remove(i);
//            }else {
//                set.add(i);
//            }
//        }
//        System.out.println(set);
//        int count=0;
//        for (int i = 0; i < s.length; i++) {
//            if (set.contains(s[i])){
//                count++;
//                if(count == k){
//                    System.out.println(s[i]);
//                    return;
//                }
//            }
//        }
    }
}
