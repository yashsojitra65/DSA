package Arrays;
//Largest contiguous sum..
public class contiguous_Sum {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-1,4,5,-2,7};

        int sum = 0;
        int curSum = 0;

        for(int i=0; i<arr.length; i++){
            curSum += arr[i];

            if(curSum > sum){
                sum = curSum;
            } else if(curSum < 0){
                curSum = 0;
            }
        }
        System.out.println(sum);
    }
}
