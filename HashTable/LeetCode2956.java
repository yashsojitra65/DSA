package HashTable;
import java.util.*;
//10-12-2023
//2956.Find Common Elements Between Two Arrays.
public class LeetCode2956 {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 3, 1};
        int[] arr2 = {2, 2, 5, 2, 3, 6};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : arr1){
            set1.add(i);
        }
        for (int i : arr2){
            set2.add(i);
        }
        int ans[] = new int[2];

        int count = 0;
        for (int i : arr1) {
            if (set2.contains(i)){
                count++;
            }
        }
        ans[0] = count;
        count = 0;

        for (int i : arr2) {
            if (set1.contains(i)){
                count++;
            }
        }
        ans[1] = count;

        System.out.println(Arrays.toString(ans));
    }
}
