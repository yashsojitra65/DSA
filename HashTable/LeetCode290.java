package HashTable;

import java.util.HashMap;

public class LeetCode290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        String[] arr = s.split(" ");

        HashMap<Character,String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(arr[i])){
                    System.out.println(false);
                    return;
                }
            }else {
                if(map.containsValue(arr[i])){
                    System.out.println(false);
                    return;
                }
                map.put(pattern.charAt(i),arr[i]);
            }
        }
        System.out.println(true);
//        HashMap<Character,Integer> map1 = new HashMap<>();
//        HashMap<String,Integer> map2 = new HashMap<>();
//
//        for(char c : pattern.toCharArray()){
//            map1.put(c,map1.getOrDefault(c,0)+ 1);
//        }
//        for(int i=0; i< arr.length; i++){
//            if(map2.containsKey(arr[i])){
//                map2.put(arr[i],map2.get(arr[i]) + 1);
//            }else {
//                map2.put(arr[i],1);
//            }
//        }
//        System.out.println(map1);
//        System.out.println(map2);
//
//        for(int i=0; i<map1.size(); i++){
//            if(!map1.containsValue(map2.get(arr[i]))){
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println(true);
    }
}
