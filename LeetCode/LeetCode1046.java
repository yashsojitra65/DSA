package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//25-04-2023
//1046. Last Stone Weight.
public class LeetCode1046 {
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i< arr.length; i++){
            list.add(arr[i]);
        }
        while (list.size() > 1){
            Collections.sort(list);
            int max1 = list.get(list.size() - 1);
            int max2 = list.get(list.size() - 2);
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
            if(max1 != max2){
                list.add(max1 - max2);
            }
        }
        System.out.print(list);
    }
}
