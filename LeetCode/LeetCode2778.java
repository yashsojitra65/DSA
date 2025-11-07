package LeetCode;

//18-07-2023
//2778.Sum of Squares of Special Elements.
public class LeetCode2778 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int count = 0;

        for(int i=0; i< arr.length; i++){
            if(arr.length % (i+1) == 0){
                count += arr[i] * arr[i];
            }
        }
        System.out.println(count);
    }
}
