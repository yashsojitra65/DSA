package LeetCode;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] arr = {2,11,7,15};
        int n = arr.length;
        int value = 9;

        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[i] + arr[j] == value){
                    System.out.print(i + " " + j);
                }
            }
        }
    }
}
