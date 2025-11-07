package HashTable;

import java.util.*;

//01-05-2023
//5. Count pairs with given sum.
public class countPair {
    public static void main(String[] args) {
        int[] arr = {1,5,5,5,5,7,9};
        int sum = 10;
        int count = 0;

        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            int key = sum - i;
            if(set.contains(key)){
                count++;
            }else {
                set.add(i);
            }
        }
        System.out.println(count);
    }
}
