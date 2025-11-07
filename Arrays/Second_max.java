package Arrays;
//second max.
public class Second_max {
    public static void main(String[] arg) {
        int arr[] = {10, 2, 3, 9, 20, 5, 1};
        int mx1 = arr[1];
        int mx2 = arr[0];
        int n = arr.length;

        if(arr[1] > arr[0]){
            mx1 = arr[1];
            mx2 = arr[0];
        }else{
            mx1 = arr[0];
            mx2 = arr[1];
        }
        for(int i=2; i<=n-1; i++){
            if(mx1 < arr[i]){
                mx2 = mx1;
                mx1 = arr[i];
            } else if (mx2 < arr[i]) {
                mx2 = arr[i];
            }
        }
        System.out.println(mx2);
    }
}
