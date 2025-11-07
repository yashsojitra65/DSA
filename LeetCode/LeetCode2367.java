package LeetCode;

import java.util.*;

//07-02-2023
//2367. Number of Arithmetic Triplets
public class LeetCode2367 {
    public static void main(String[] args) {
        int arr[] = {0,1,4,6,7,10};
        int n = arr.length;
        int diff = 3;
        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }
        System.out.println(set);




//        for(int i=0; i<n; i++){
//            for(int j=1; j<n; j++){
//               for(int k=2; k<n; k++){
//                   if(arr[j] - arr[i] == diff && arr[k] - arr[j] == diff){
//                       count++;
//                   }
//               }
//            }
//        }
//        System.out.println(count);
    }
}
