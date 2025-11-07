package Arrays;

public class sort2 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 6, 1};
        int n = arr.length;

        for (int i = 0; i < n ; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i< n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
