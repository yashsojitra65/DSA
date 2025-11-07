package LeetCode;

//27-02-2023
//961. N-Repeated Element in Size 2N Array.
public class LeetCode961 {
    public static void main(String[] args) {
        int[] arr = {5,1,5,2,5,3,5,4};
        int count = 0;

        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count = arr[i];
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
