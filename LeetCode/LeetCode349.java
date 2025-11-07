package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

//18-03-2023
//349. Intersection of Two Arrays.
public class LeetCode349 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr2[j]);
                    break;
                }
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : list){
            if (!temp.contains(i)){
                temp.add(i);
            }
        }
        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++){
            ans[i] = temp.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
