package HashTable;
import java.util.*;
//22-12-2023
//1807.Evaluate the Bracket Pairs of a String.
public class LeetCode1807 {
    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        String[][] knowledgeArray = {{"name", "bob"}, {"age", "two"}};
        HashMap<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        List<List<String>> knowledgeList = new ArrayList<>();
        for (String[] pair : knowledgeArray) {
            List<String> list = new ArrayList<>();
            list.add(pair[0]);
            list.add(pair[1]);
            knowledgeList.add(list);
        }

        for (List<String> list : knowledgeList) {
            map.put(list.get(0), list.get(1));
        }
        System.out.println(map);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(') {
                sb.append(s.charAt(i));
            }
            if (s.charAt(i) == '(') {
                int k = i + 1;
                while (i < s.length() && s.charAt(i) != ')') {
                    i++;
                }
                sb.append(map.getOrDefault(s.substring(k, i), "?"));
            }
        }
        System.out.println(sb);
    }
}
