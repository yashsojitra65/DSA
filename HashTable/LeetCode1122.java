package HashTable;

import java.util.*;
//12-05-2023
//1122.Relative Sort Array.
public class LeetCode1122 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] ans = new int[arr1.length];
        int k = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        System.out.println(map);

        for(int i=0; i< arr2.length; i++){
            int n = map.get(arr2[i]);
            while (n > 0){
                ans[k] = arr2[i];
                k++;
                n--;
            }
        }
        ArrayList<Integer> ans1 = new ArrayList<>();
        boolean b = true;
        for(int i=0;i<arr1.length; i++){
            b = true;
            for(int j=0;j< arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    b = false;
                    break;
                }
            }
            if(b){
                ans1.add(arr1[i]);
            }
        }
        Collections.sort(ans1);
        for(int i : ans1){
            ans[k] = i;
            k++;
        }
        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
