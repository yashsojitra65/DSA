package HashTable;

import java.util.*;
//30-05-2023
//1790. Check if One String Swap Can Make Strings Equal.
public class LeetCode1790 {
    public static void main(String[] args) {
        String s1 = "attack";
        String s2 = "defend";

        int left = 0;
        int right = s1.length() - 1;
        boolean ans = false;

        while(left <= right){
            if(s1.charAt(left) == s2.charAt(left)){
                left++;
                continue;
            }
            if(s1.charAt(right) == s2.charAt(right)){
                right--;
                continue;
            }
            if(ans){
                System.out.println(false);
                return;
            }
            if(s1.charAt(left) == s2.charAt(right) && s1.charAt(right) == s2.charAt(left)){
                ans = true;
                left++;
                right--;
                continue;
            }
            System.out.println(false);
            return;
        }
        System.out.println(true);

//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for(char c : s1.toCharArray()){
//            if(map.containsKey(c)){
//                map.put(c,map.get(c) + 1);
//            }else {
//                map.put(c,1);
//            }
//        }
//        System.out.println(map);
//
//        for(int i=0; i<s2.length(); i++){
//            char c = s2.charAt(i);
//            if(map.containsKey(c)){
//                map.put(c, map.get(c) - 1);
//                if(map.get(c) == 0){
//                    map.remove(c);
//                }
//            }
//        }
//        System.out.println(map.isEmpty());
    }
}
