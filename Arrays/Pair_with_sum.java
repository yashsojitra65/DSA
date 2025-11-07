package Arrays;
//Pair with sum present or not? Two pointers
public class Pair_with_sum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int sum = 50;
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            if(arr[left] + arr[right] == sum){
                System.out.println("present");
                return;
            }else if (arr[left] + arr[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("not present");
    }
}
