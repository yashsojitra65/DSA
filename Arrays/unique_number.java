package Arrays;

//25-01-2023
//Check if given number is unique or not
public class unique_number {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 3, 9, 9, 2};
        int n = arr.length;
        int value = 2;
        int count = 0;
        int k = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == value){
                count++;
                k = arr[i];
            }
        }
        if(count<=1 && k==value){
            System.out.println("Unique");
        }else if (k != value){
            System.out.println("Not Found");
        }else {
            System.out.println("Not Unique");
        }
    }
}
