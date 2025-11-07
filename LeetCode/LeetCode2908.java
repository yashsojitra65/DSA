package LeetCode;
//22-10-2023
//2908.Minimum Sum of Mountain Triplets I.
public class LeetCode2908 {
    public static void main(String[] args) {
        int[] arr = {8,6,1,5,3};
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                for(int k=j+1; k< arr.length; k++){
                    if(arr[i] < arr[j] && arr[k] < arr[j]){
                        int val = arr[i] + arr[j] + arr[k];
                        min = Math.min(val,min);
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        System.out.println(min);
    }
}
