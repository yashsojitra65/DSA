package LeetCode;

//03-02-2023
//1512. Number of Good Pairs
public class LeetCode1512 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
