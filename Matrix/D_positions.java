package Matrix;

//13-01-2023
//Given an array, rotate by d positions
public class D_positions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int d = 101;
        d = d % n;

        for(int i=0; i<d; i++){
            int temp = arr[0];
            int j=0;
            while (j < n-1){
                arr[j] = arr[j+1];
                j++;
            }
            arr[n-1] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
