package BinarySearch;
//25-07-2023
//852.Peak Index in a Mountain Array.
public class LeetCode852 {
    public static void main(String[] args) {
        int[] arr = {0,8,10,5,2,1,0};
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = (left + right)/2;
            if(arr[mid] < arr[mid+1]) {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        System.out.println(left);
    }
}
