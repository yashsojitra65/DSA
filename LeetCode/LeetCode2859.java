package LeetCode;
import java.util.*;
//19-09-2023
//2859.Sum of Values at Indices With K Set Bits.
public class LeetCode2859 {
    public static void main(String[] args) {
        int[] nums = {5,10,1,5,2};
        List<Integer> list = new ArrayList<>();
        for (int i : nums){
            list.add(i);
        }
        int k = 1;
        int sum = 0;

        for (int i=0; i<list.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += list.get(i);
            }
        }
        System.out.println(sum);
    }
}
