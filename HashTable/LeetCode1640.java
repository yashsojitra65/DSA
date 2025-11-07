package HashTable;

import java.util.HashMap;
//23-05-2023
//1640. Check Array Formation Through Concatenation.
public class LeetCode1640 {
    public static void main(String[] args) {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78},{4,64},{91}};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],i);
        }
        System.out.println(map);
        for(int[] i : pieces){
            int k = i[0];
            if(!map.containsKey(k)){
                System.out.println(false);
                return;
            }
            int j = 0;
            int n = map.get(k);
            while (j < i.length && j < arr.length){
                if(i[j] != arr[n]){
                    System.out.println(false);
                    return;
                }
                n++;
                j++;
            }
            if(j != i.length){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
