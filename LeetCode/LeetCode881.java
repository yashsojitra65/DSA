package LeetCode;
import java.util.*;
//19-09-2023
//881.Boats to Save People.
public class LeetCode881 {
    public static void main(String[] args) {
        int[] arr = {3,5,3,4};
        Arrays.sort(arr);
        int limit = 3;
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left <= right){
            if(arr[left] + arr[right] <= limit){
                left++;
            }
            right--;
            count++;
        }
        System.out.println(count);
    }
}
