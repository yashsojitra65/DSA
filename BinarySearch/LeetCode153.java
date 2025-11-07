package BinarySearch;
//06-07-2023
//153.Find Minimum in Rotated Sorted Array.
public class LeetCode153 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};

        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int mid = (left + right) / 2;
            if(arr[mid] > arr[right]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        System.out.println(arr[right]);
    }
}
