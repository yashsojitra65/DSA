package LeetCode;
import java.util.*;
//18-11-2025
//1524. Number of Sub-arrays With Odd Sum.
public class LeetCode1524 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        List<List<Integer>> list = new ArrayList<>();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                sub.add(arr[j]);
                list.add(new ArrayList<>(sub));
            }
        }
        int[] sum = new int[list.size()];
        int k = 0;
        for(int i=0; i<list.size(); i++){
            int count = 0;
            for(int j=0; j<list.get(i).size(); j++){
                count += list.get(i).get(j);
            }
            sum[k++] = count;
        }

        for(int i=0; i<sum.length; i++){
            if(sum[i] % 2 != 0){
                ans++;
            }
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(sum));

        System.out.println(list);
    }
}
