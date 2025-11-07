package BinarySearch;
//03-08-2023
//81.Search in Rotated Sorted Array II.
public class LeetCode81 {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int left = 0, right = arr.length - 1;
        int k = 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                System.out.println(true);
                return;
            }
            // Edge case:
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left = left + 1;
                right = right - 1;
                continue;
            }
            // if left part is sorted:
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= k && k <= arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // if right part is sorted:
                if (arr[mid] <= k && k <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println(false);
    }
}
