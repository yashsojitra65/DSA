package LeetCode;
//05-08-2023
//1752.Check if Array Is Sorted and Rotated.
public class LeetCode1752 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int count = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] > arr[(i+1) % arr.length]){
                count++;
            }
        }
        if(count > 1){
            System.out.println(false);
        }
        System.out.println(true);
    }
}
