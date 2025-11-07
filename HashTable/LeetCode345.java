package HashTable;
import java.util.*;
//09-08-2023
//345.Reverse Vowels of a String.
public class LeetCode345 {
    public static void main(String[] args) {
        String s = "leetcode";
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;

        while (i < j) {
            while (i < j && !vowels.contains(arr[i])) {
                i++;
            }
            while (i < j && !vowels.contains(arr[j])) {
                j--;
            }
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(new String(arr));
    }
}
