package LeetCode;

import java.util.Arrays;

//11-03-2023
//1207. Unique Number of Occurrences.
public class LeetCode1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        int n = arr.length;
        int count = 0;
        int arr1[] = new int[n];
        int k = 0;
        Arrays.sort(arr);
        for (int i=0; i<n; i++){
            count=0;
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            i = i + count;
            count = count + 1;
            arr1[k] = count;
            k++;
        }
        Arrays.sort(arr1);
        int max = 0;
        for (int i=0; i< arr1.length; i++){
            if (arr1[i] == 0){
                continue;
            }else{
                for (int j=i+1; j< arr1.length; j++){
                    if (arr1[i] == arr1[j]){
                        max++;
                    }
                }
            }
        }
        if (max == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}