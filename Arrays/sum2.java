package Arrays;

public class sum2 {
    public static void main(String[] args){
        int arr[] = {1,2,-3,4,5};
        int n = arr.length;
        int max = 0;
        int mtn = 0;

        for (int i=0; i<n;i++){
            mtn = mtn + arr[i];
            if(mtn > max) {
                max = mtn;
            }
            if(mtn < 0) {
                mtn = 0;
            }
        }
        System.out.println(max);
    }
}
