package LeetCode;

//21-02-2023
//2176. Count Equal and Divisible Pairs in an Array.
public class LeetCode2176 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,2,1,3};
        int k = 2;
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j] && (i*j)%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
