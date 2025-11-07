package HashTable;

import java.util.*;
//15-05-2023
//13. Roman to Integer.
public class LeetCode13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        System.out.println(map);

        int ans = map.get(s.charAt(s.length() - 1));
        for (int i=s.length()-2;i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                ans -= map.get(s.charAt(i));
            }else {
                ans += map.get(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
