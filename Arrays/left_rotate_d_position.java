package Arrays;

//Left rotate an array by d positions.
public class left_rotate_d_position {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int d = 3;
        int j = 0;

        while (j < d) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
            j++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
