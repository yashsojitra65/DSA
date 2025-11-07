package LeetCode;

import java.util.HashSet;

//21-04-2023
//217. Contains Duplicate.
public class LeetCode217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            if(!set.add(i)){
                System.out.println(true);
                return;
            }

//            if(set.contains(i)){
//                System.out.println(true);
//                return;
//            }else {
//                set.add(i);
//            }
        }
        System.out.println(false);
    }
}
