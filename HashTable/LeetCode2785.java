package HashTable;
import java.util.*;
//24-07-2023
//2785.Sort Vowels in a String.
public class LeetCode2785 {
    public static void main(String[] args) {
        String s = "lEetcOde";
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        ArrayList<Character> list = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(set.contains(c)){
                list.add(c);
            }
        }
        if(list.isEmpty()){
            System.out.println(s);
            return;
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                sb.append(list.get(j));
                j++;
            }else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
