package LeetCode;
import java.util.*;
//05-11-2025
//3718. Smallest Missing Multiple of K.
public class LeetCode3718 {
    public static void main(String[] args) {
        int[] arr = {8,2,3,4,6};
        int k = 2;
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i : arr){
            set.add(i);
        }

        for(int i=1; i<=arr.length + 1; i++){
            if(!set.contains(i * k)){
                ans = i * k;
                break;
            }
        }
        System.out.println(ans);
    }
}
