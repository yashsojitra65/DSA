package HashTable;

import java.util.*;
//17-05-2023
//1796. Second Largest Digit in a String
public class LeetCode1796 {
    public static void main(String[] args) {
        String s = "dfa12321afd";
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                set.add(Character.getNumericValue(c));
            }
        }
        System.out.println(set);

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(set.size() < 2){
            System.out.println(-1);
        }
        ans = list.get(list.size() - 2);
        System.out.println(ans);
    }
}
