package LeetCode;

//07-02-2023
//1588. Sum of All Odd Length SubArrays
public class LeetCode1588 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int n = arr.length;
        int a = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                if((j-i+1)%2 == 1){
                    for(int k=i; k<=j; k++){
                        sum = sum + arr[k];
                    }
                    a = a + sum;
                }
            }
        }
        System.out.println(a);
    }
}
