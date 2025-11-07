package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//27-02-2023
//2089. Find Target Indices After Sorting Array.
public class LeetCode2089 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        List<Integer> list = new ArrayList<>();
        int value = 2;

        Arrays.sort(arr);

        for(int i=0; i< arr.length; i++){
            if(arr[i] == value){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
