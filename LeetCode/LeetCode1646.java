package LeetCode;
//26-09-2023
//1646.Get Maximum in Generated Array.
public class LeetCode1646 {
    public static void main(String[] args) {
        int n = 7;
        if(n==0 || n==1) {
            System.out.println(n);
            return;
        }
        int arr[]=new int [n+1];
        arr[0] = 0;
        arr[1] = 1;
        int max = Integer.MIN_VALUE;

        for(int i=2; i<=n; i++){
            if(i%2 == 0){
                arr[i] = arr[i/2];
            }
            else{
                arr[i] = arr[i/2] + arr[i/2 + 1];
            }
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}
