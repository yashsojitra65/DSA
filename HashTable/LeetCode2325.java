package HashTable;

import java.util.*;
//31-05-2023
//2325.Decode the Message.
public class LeetCode2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        HashMap<Character,Character> map = new HashMap<>();
        int idx=0;

        for(char c : key.toCharArray()){
            if(map.containsKey(c) || c == ' '){
                continue;
            }
            map.put(c,(char)('a' + (idx++)));
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        for(char c : message.toCharArray()){
            if(c == ' '){
                sb.append(' ');
            }else {
                sb.append(map.get(c));
            }
        }
        System.out.println(sb);
    }
}
