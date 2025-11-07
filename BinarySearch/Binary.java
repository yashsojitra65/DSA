package BinarySearch;
public class Binary {
    public static void main(String[] arg){
        int arr[] = {2,4,6,7,9,10,15};
        int value = 10;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = (left + right)/2;
            if(value > arr[mid]) {
                left = mid + 1;
            } else if (value < arr[mid]) {
                right = mid - 1;
            } else if (value == arr[mid]) {
                System.out.println(arr[mid] + " value is present.");
                return;
            }
        }
        System.out.println("Value not present.");
    }
}
