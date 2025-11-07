package HashTable;
import java.util.*;
//25-08-2023
//648.Replace Words.
public class LeetCode648 {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        String sentence = "the cattle was rattled by the battery";
        s.add("cat");
        s.add("bat");
        s.add("rat");

        Set<String> set = new HashSet();
        for (String i: s) {
            set.add(i);
        }

        StringBuilder ans = new StringBuilder();
        for (String word: sentence.split(" ")) {
            String prefix = "";
            for (int i=1; i<=word.length(); i++) {
                prefix = word.substring(0, i);
                if (set.contains(prefix)) {
                    break;
                }
            }
            if (ans.length() > 0){
                ans.append(" ");
            }
            ans.append(prefix);
        }
        System.out.println(ans.toString());
    }
}
