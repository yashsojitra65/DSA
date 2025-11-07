package Arrays;

public class DuplicateNumber {
    public static void main(String[] arg){
        int arr[] = {1,2,3,4,5,6,6,8,7,10,9};
        int n = arr.length-1;
        int sum = 0;
        int m = n*(n+1)/2;

        for(int i=0; i<=n; i++){
            sum += arr[i];
        }
        System.out.println(sum-m);
    }
}
