package String;
import java.util.*;
//29-07-202
//Remove duplicate chars from string.
public class Remove_duplicate_chars {
    public static void main(String[] args) {
        String s = "yashyash";
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        String ans = "";

        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])) {
                ans += arr[i];
                map.put(arr[i], 1);
            }
        }
        System.out.println(ans);
    }
}
