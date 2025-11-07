package LeetCode;

//29-04-2023
//88. Merge Sorted Array.
public class LeetCode88 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

        for(int f=0; f<arr1.length; f++){
            System.out.print(arr1[f] + " ");
        }
    }
}