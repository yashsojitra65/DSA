package HashTable;

import java.util.*;

public class LeetCode792 {
    public static void main(String[] args) {
        String s = "abcde";
        String[] arr = {"a","bb","acd","ace"};
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        System.out.println(map);
        int j = 0;
//        for(Map.Entry<Character,Integer> me : map.entrySet()){
//            for(int i=0; i<arr.length;i++){
//                String s1 = arr[i];
//                if(map.containsKey(s1.charAt(j))){
//                    count++;
//                    j++;
//                }
//                j= 0;
//            }
//        }

        for(int i=0; i<arr.length; i++){
            String s1 = arr[i];
            for(Map.Entry<Character,Integer> me : map.entrySet()){
                j = 0;
                if(map.containsKey(s1.charAt(j))){
                    j++;
                    count++;
                }
                break;
            }
        }
    }
}
