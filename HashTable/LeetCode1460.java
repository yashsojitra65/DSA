package HashTable;

import java.util.*;

//07-05-2023
//1460. Make Two Arrays Equal by Reversing SubArrays.
public class LeetCode1460 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {1,2,1,3};
//      HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr1){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else{
                map.put(i,1);
            }

        }
        System.out.println(map);

        for(int i : arr2){
            if(!map.containsKey(i)){
                System.out.println(false);
                return;
            }else {
                int k = map.get(i) - 1;
                if(k == 0){
                    map.remove(i);
                }else {
                    map.put(i,k);
                }
            }
        }
        System.out.println(true);

//        for(int i=0; i<arr2.length; i++){
//            if(!map.containsKey(arr2[i]) || map.get(arr2[i]) == 0){
//                System.out.println(false);
//                return;
//            }else {
//                map.put(arr2[i],map.get(arr2[i]) - 1);
//            }
//        }
//        System.out.println(true);

//        for(int i : arr1){
//            set.add(i);
//        }
//        for(int i=0; i<arr2.length;i++){
//            if(!set.contains(arr2[i])){
//                System.out.println(false);
//                return;
//            }
//        }
//        System.out.println(true);
    }
}
