package LeetCode;

//08-02-2023
//1534.Count Good Triplets.
public class LeetCode1534 {
    public static void main(String[] args) {
        int arr[] = {3,0,1,1,9,7};
        int n = arr.length;
        int count = 0;
        int a = 7;
        int b = 2;
        int c = 3;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+2; k<n; k++){
                    if((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
