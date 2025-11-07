package Arrays;
//Find 3rd largest element from array.
public class find_3_Largest_Number {
    public static void main(String[] args) {
        int arr[] = {8,5,4,9,9,8,3};
        int mx1 = arr[0];
        int mx2 = Integer.MIN_VALUE;
        int mx3 = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > mx1){
                mx3 = mx2;
                mx2 = mx1;
                mx1 = arr[i];
            }else if (arr[i] > mx2){
                mx3 = mx2;
                mx2 = arr[i];
            }else if(arr[i] > mx3){
                mx3 = arr[i];
            }
        }
        System.out.println(mx3);
    }
}
