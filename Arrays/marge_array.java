package Arrays;
import java.util.*;

public class marge_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = new int[arr.length*2];
        int k = arr.length;

        for(int i=0; i<k; i++){
            ans[i] = arr[i];
            ans[k+i] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}