package LeetCode;
import java.util.*;
//21-07-2023
//2744.Find Maximum Number of String Pairs.
public class LeetCode2744 {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        HashSet<String> set = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;

        for (String s : words) {
            String ans = new StringBuilder(s).reverse().toString();
            if(map.containsKey(ans)) {
                map.put(ans, map.get(ans)+1);
            }
            else{
                map.put(s,0);
            }
        }
        for(int value : map.values()) {
            count += value;
        }
//        for(String i : words){
//            StringBuilder sb = new StringBuilder(i);
//            String s = sb.reverse().toString();
//
//            if(set.contains(s)){
//                count++;
//            }
//            set.add(i);
//        }


//        for (int i=0; i< words.length; i++){
//            String s = words[i];
//            String ans = s.charAt(1) + "" + s.charAt(0);
//            for(int j=i+1; j< words.length; j++){
//                if(ans.equals(words[j])){
//                    count++;
//                }
//            }
//        }
        System.out.println(count);
    }
}
