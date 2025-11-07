package Arrays;

//30-01-2023
//Negative-positive-number
public class Negative_positive_num {
    public static void main(String[] args) {
        int[] arr = {-5,8 ,9 ,10 ,2, 6, -7 ,7};
        int n = arr.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                if(i > j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
