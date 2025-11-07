package BinarySearch;
//03-08-2023
//367.Valid Perfect Square.
public class LeetCode367 {
    public static void main(String[] args) {
        int num = 16;
        long left = 1;
        long right = num;

        while (left <= right){
            long mid = left + (right - left) / 2;
            if(mid * mid == num){
                System.out.println(true);
                return;
            } else if (mid * mid < num) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println(false);
    }
}
