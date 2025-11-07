package LeetCode;
import java.util.*;
//07-10-2023
//2856.Minimum Array Length After Pair Removals.
public class LeetCode2856 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
//        list.add(9);

        int i = 0;
        int j = list.size()/2;

        int ans = 0;
        while(j < list.size()){
            if(!list.get(i).equals(list.get(j))){
                ans += 2;
            }
            i++;
            j++;
        }
        if(list.size() - ans >= 0){
            System.out.println(list.size() - ans);
        }
        System.out.println(1);
    }
}
