package LeetCode;

//03-02-2023
//2535. Difference Between Element Sum and Digit Sum of an Array
public class LeetCode2535 {
    public static void main(String[] args) {
        int arr[] = {1,15,6,3};
        int n = arr.length;
        int sum = 0;
        int digit = 0;

        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            int num = arr[i];
            while (num > 0){
                digit = digit + num % 10;
                num = num / 10;
            }
        }
        System.out.println(sum - digit);
    }
}
