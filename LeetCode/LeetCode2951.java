package LeetCode;
import java.util.*;
//04-12-2023
//2951.Find the Peaks.
public class LeetCode2951 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,8,5};
        List<Integer> list = new ArrayList<>();

        for(int i=1; i< arr.length-1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
