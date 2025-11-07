package Arrays;

//30-01-2023
//fix min and max number
public class min_max_num {
    public static void main(String[] args) {
        int arr[] = {12,5,6,17,1};
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
