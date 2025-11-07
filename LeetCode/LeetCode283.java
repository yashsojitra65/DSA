package LeetCode;

//16-04-2023
//283. Move Zeroes
public class LeetCode283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else if (count > 0) {
                int k = arr[i];
                arr[i] = 0;
                arr[i - count] = k;
            }
        }

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
