package HashTable;
import java.util.*;
//11-12-2023
//1287.Element Appearing More Than 25% In Sorted Array.
public class LeetCode1287 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        System.out.println(map);
        int size = arr.length / 4;

        for (int  i : map.keySet()){
            if(map.get(i) > size){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
