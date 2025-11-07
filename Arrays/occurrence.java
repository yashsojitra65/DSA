package Arrays;

public class occurrence {
    public static void main(String[] args) {
        int[] even = {1, 2, 3, 3, 5};
        System.out.println(first(even, 5, 3));
        System.out.println(last(even, 5, 3));
    }
    public static int first(int[] arr, int n, int key) {
        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            if (arr[mid] == key) {
                ans = mid;
                e = mid - 1;
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else if (key < arr[mid]) {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static int last(int[] arr, int n, int key) {
        int s = 0;
        int e = n - 1;
        int mid = s + (e - s) / 2;
        int ans = -1;

        while (s <= e) {
            if (arr[mid] == key) {
                ans = mid;
                s = mid + 1;
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else if (key < arr[mid]) {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }
}
