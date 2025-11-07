package LeetCode;

public class LeetCode27 {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        int n = arr.length;
        int value = 2;
        int j = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != value){
                arr[j] = arr[i];
                j++;
            }
        }
        System.out.println(j);
    }
}
