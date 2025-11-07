package LeetCode;

import java.util.*;

//03-11-2025
//3289. The Two Sneaky Numbers of Digitville.
public class LeetCode3289 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,4,3,4,6,0,9,5,8,2};
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(set.contains(i)){
                list.add(i);
            }else {
                set.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
