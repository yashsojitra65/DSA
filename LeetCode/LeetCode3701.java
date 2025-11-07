package LeetCode;
//06-11-2025
//3701. Compute Alternating Sum
public class LeetCode3701 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int sum = 0;

        for(int i=0; i< arr.length; i++){
            if(i % 2 == 0){
                sum += arr[i];
            }else {
                sum -= arr[i];
            }
        }
        System.out.println(sum);
    }
}
