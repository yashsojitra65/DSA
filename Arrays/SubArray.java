package Arrays;

//30-01-2023
//SubArray with given sum
public class SubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        //int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int sum = 12;

        for (int i=0; i<n; i++) {
            int currSum = arr[i];
            for (int j=i+1; j<n; j++) {
                currSum = currSum + arr[j];
                if (currSum == sum) {
                    System.out.println("Sum found between indexes " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("No Subarray found");
    }
}
