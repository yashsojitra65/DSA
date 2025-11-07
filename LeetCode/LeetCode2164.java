package LeetCode;
import java.util.*;
//19-08-2023
//2164.Sort Even and Odd Indices Independently.
public class LeetCode2164 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3};
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd);
        Collections.reverse(odd);
        Collections.sort(even);

        int o = 0;
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = even.get(e++);
            } else {
                arr[i] = odd.get(o++);
            }
        }
        System.out.println(arr);
    }
}
