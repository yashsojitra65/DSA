package HashTable;

import java.util.*;
//28-05-2023
//859. Buddy Strings.
public class LeetCode859 {
    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        HashSet<Character> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        if(s.equals(goal)) {
            for (char c : goal.toCharArray()) {
                set.add(c);
            }
            if (set.size() < goal.length()) {
                System.out.println(true);
                return;
            } else {
                System.out.println(false);
                return;
            }
        }

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)) {
                list.add(i);
            }
        }
        if(list.size() == 2 && s.charAt(list.get(0)) == goal.charAt(list.get(1))
                && s.charAt(list.get(1)) == goal.charAt(list.get(0))){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
