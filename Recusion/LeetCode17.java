package Recusion;

import java.util.*;
//16-05-2023
//17. Letter Combinations of a Phone Number.
public class LeetCode17 {
    public static void main(String[] args) {
        String digits = "23";
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            System.out.println(ans);
            return;
        }
        String temp = "";
        phoneNumber(0 , digits , temp , ans , map); ;
        System.out.println(ans);
    }
    public static void phoneNumber(int i, String s, String temp, List<String> ans, HashMap<Character,String> map){
        if (i == s.length()) {
            ans.add(temp);
            return;
        }
        char chr = s.charAt(i);
        String str = map.get(chr);

        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            phoneNumber(i + 1, s, temp + c, ans, map);
        }
    }
}
