package LeetCode;
import java.util.*;
//15-08-2023
//78.Subsets.
public class LeetCode78 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int i=0; i< arr.length; i++){
            int size = ans.size();
            for(int j=0; j<size; j++){
                List<Integer> list = new ArrayList<>(ans.get(j));
                list.add(arr[i]);
                ans.add(list);
            }
        }
        System.out.println(ans);
    }
}
