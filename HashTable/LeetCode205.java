package HashTable;
import java.util.*;
//30-05-2023
//205.Isomorphic Strings.
public class LeetCode205 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                    System.out.println(false);
                    return;
                }
            }else {
                if(map.containsValue(t.charAt(i))){
                    System.out.println(false);
                    return;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        System.out.println(true);
    }
}