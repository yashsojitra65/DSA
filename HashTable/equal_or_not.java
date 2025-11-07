package HashTable;
import java.util.*;
//02-05-2023
//4.Check if two arrays are equal or not.
public class equal_or_not {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,4,0,0};
        int[] arr2 = {2,4,5,0,1,7};
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        if(arr1.length != arr2.length){
            System.out.println(false);
            return;
        }
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        System.out.println(map);

        for(int i : arr2){
            if(!map.containsKey(i)){
                System.out.println(false);
                return;
            }
            if(map.get(i) == 0){
                System.out.println(false);
                return;
            }
            count = map.get(i);
            map.put(i,count-1);
        }

//        for(int i=0; i<arr1.length; i++){
//            if(map.get(arr1[i]) == null){
//                map.put(arr1[i], 1);
//            }else {
//                count = map.get(arr1[i]);
//                count++;
//                map.put(arr1[i],count);
//            }
//        }
//        for(int i=0; i< arr1.length; i++){
//            if(!map.containsKey(arr2[i])){
//                System.out.println(false);
//                return;
//            }
//            if(map.get(arr2[i]) == 0){
//                System.out.println(false);
//                return;
//            }
//            count = map.get(arr2[i]);
//            --count;
//            map.put(arr2[i],count);
//        }
        System.out.println(true);
    }
}
