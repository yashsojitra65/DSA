package BinarySearch;
//03-08-2023
//33.Search in Rotated Sorted Array.
public class LeetCode33 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == target){
                System.out.print(mid);
                return;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        System.out.print(-1);
    }
}
