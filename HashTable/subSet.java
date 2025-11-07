package HashTable;
import java.util.*;
//01-05-2023
//1.Find whether an array is subset of another array.
public class subSet {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 2, 23, 19};
        int[] arr2 = {19, 5, 3};
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            if(!set.contains(i)){
                System.out.print("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
