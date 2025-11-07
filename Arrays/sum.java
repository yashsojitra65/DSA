package Arrays;

public class sum {
    public static void main(String[] args) {
        int arr[] = {9,2,8,7,3,0,4};
        int n = arr.length;
        int m = 5;

//        for(int i = 0; i<=n; i++){
//            for(int j = i+1;j<n;j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        for(int k = 0;k<=n-1;k++){
            System.out.print(arr[k] + " ");
        }

        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == m){
                    System.out.println(true);
                    return;
                }
            }
        }
//        for(int i=0; i<=n-1; i++){
//            for(int j=n-1; j>=i; j--){
//                if ((arr[j] + arr[i]) == m){
//                    System.out.println("True");
//                    return;
//                }
//            }
//        }
        System.out.println("False");
    }
}
