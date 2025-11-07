package LeetCode;
import java.util.*;
//19-10-2023
//13.Roman to Integer.
public class LeetCode13 {
    public static void main(String[] args) {
        String s = "III";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = map.get(s.charAt(s.length() - 1));

        for(int i=s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                sum = sum - map.get(s.charAt(i));
            }else{
                sum = sum + map.get(s.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
