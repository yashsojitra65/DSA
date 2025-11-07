package BinarySearch;
//04-08-2023
//34.Find First and Last Position of Element in Sorted Array.
public class LeetCode34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = new int[2];
        int start = -1;
        int end = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
            if(arr[i] > target){
                break;
            }
        }
        ans[0] = start;
        ans[1] = end;
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
