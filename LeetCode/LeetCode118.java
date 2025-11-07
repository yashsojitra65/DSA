package LeetCode;
import java.util.*;
//08-08-2023
//118.Pascal's Triangle.
public class LeetCode118 {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int sum = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    row.add(sum);
                }
            }
            list.add(row);
        }
        System.out.println(list);
    }
}
