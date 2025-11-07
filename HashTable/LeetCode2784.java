package HashTable;
import java.util.*;
//12-08-2023
//2784.Check if Array is Good.
public class LeetCode2784 {
    public static void main(String[] args) {
        int[] arr = {1,3,3,2};
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=1; i< arr.length-1; i++){
            map.put(i,1);
        }
        map.put(arr.length - 1,2);

        for (int i : arr){
            Integer count = map.get(i);
            if (count == 0) {
                System.out.println(false);
                return;
            }
            if (count == 1) {
                map.remove(i);
            } else {
                map.put(i, count - 1);
            }
        }
        System.out.println(map.isEmpty());
    }
}
