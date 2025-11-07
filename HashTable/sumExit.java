package HashTable;
import java.util.*;
//01-05-2023
//2.Check if pair with given Sum exists in Array.
public class sumExit {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, -1, 5};
        int sum = 10;
        HashSet<Integer> set = new HashSet<>();

//        for(int i=0; i< arr.length; i++) {
//            if (!set.contains(arr[i]) && set.contains(sum - arr[i])) {
//                System.out.println(true);
//                return;
//            } else {
//                set.add(arr[i]);
//            }
//        }
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            int key = sum - arr[i];
            if(map.containsKey(key)){
                System.out.print(true);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.print(false);
    }
}
