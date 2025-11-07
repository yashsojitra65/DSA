package HashTable;

import java.util.*;
//13-05-2023
//1002. Find Common Characters
public class LeetCode1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> list = new ArrayList<>();
        HashMap<Character,Integer> map1 = new HashMap<>();

        for (int i = 0; i < words[0].length() ; i++) {
            if(!map1.containsKey(words[0].charAt(i))){
                map1.put(words[0].charAt(i),1);
            } else {
                map1.put(words[0].charAt(i),map1.get(words[0].charAt(i))+1);
            }
        }
        System.out.println(map1);
        for (int i = 1; i < words.length; i++) {
            String k = words[i];
            HashMap<Character,Integer> map2 = new HashMap<>();
            for (int j = 0; j <k.length() ; j++) {
                if(!map2.containsKey(k.charAt(j))){
                    map2.put(k.charAt(j),1);
                }else{
                    map2.put(k.charAt(j),map2.get(k.charAt(j))+1);
                }
            }
            System.out.println(map2);
            for (char c : map1.keySet()) {
                if(map2.containsKey(c)){
                    int freq = map2.get(c);
                    map1.put(c,Math.min(freq,map1.get(c)));
                }else {
                    map1.put(c, 0);
                }
            }
        }
        for (char c : map1.keySet()) {
            int currcount = map1.get(c);
            while(currcount > 0){
                list.add(String.valueOf(c));
                --currcount;
            }
        }
        System.out.println(list);
    }
}
