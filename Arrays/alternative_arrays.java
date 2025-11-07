package Arrays;
import java.util.*;
//23-11-2023
//16.Arr1, arr2 same size -> arr3 alternative.
public class alternative_arrays {
    public static void main(String[] args) {
        int[] arr1 = {5,4,10,3,13,24,2};
        int[] arr2 = {8,9,10,25,16,48,12};
        int[] ans = new int[arr1.length + arr2.length];
        int idx = 0;

        for(int i=0; i<arr1.length; i++){
            ans[idx++] = arr1[i];
            ans[idx++] = arr2[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
