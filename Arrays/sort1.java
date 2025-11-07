package Arrays;

public class sort1 {
    public static void main(String[] args){
        int arr[] = {3,1,5,10,8,6};
        int n = arr.length;

        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
