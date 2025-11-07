package HashTable;
import java.util.*;
//25-08-2023
//820.Short Encoding of Words.
public class LeetCode820 {
    public static void main(String[] args) {
        String[] words = {"time", "me", "bell"};
        HashSet<String> set1 = new HashSet<>(Arrays.asList(words));
        HashSet<String> set2 = new HashSet<>(set1);

        for (String word : set1) {
            for (int i = 1; i < word.length(); i++) {
                String subString = word.substring(i);
                set2.remove(subString);
            }
        }

        int count = 0;
        for (String word : set2) {
            count += word.length();
        }

        System.out.println(count + set2.size());
//        HashSet<String> set1 = new HashSet<>();
//        HashSet<String> set2 = new HashSet<>();
//
//        for(String word : words) {
//            set1.add(word);
//            set2.add(word);
//        }
//
//        for(String word : set1){
//            for(int i=0; i<word.length(); i++){
//                String subString = word.substring(i + 1);
//                if(set2.contains(subString)) {
//                    set2.remove(subString);
//                }
//            }
//        }
//        System.out.println(set2);
//        int count = 0;
//        for(String word : set2) {
//            count += word.length();
//        }
//
//        System.out.println(count + set2.size());
    }
}
