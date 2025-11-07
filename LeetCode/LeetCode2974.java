package LeetCode;
import java.util.*;
//25-12-2023
//2974.Minimum Number Game.
public class LeetCode2974 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
