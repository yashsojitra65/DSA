package BinarySearch;
//06-03-2023
//1539. Kth Missing Positive Number.
public class LeetCode1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] - mid - 1 >= k)
                right = mid;
            else
                left = mid + 1;
        }
        System.out.println(left + k);
    }
}
