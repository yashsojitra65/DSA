package LeetCode;

//23-02-2023
//1295. Find Numbers with Even Number of Digits.
public class LeetCode1295 {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int n = arr.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            int digit = 0;
            while (arr[i] > 0){
                digit++;
                arr[i] /= 10;
            }
            if(digit % 2 == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
