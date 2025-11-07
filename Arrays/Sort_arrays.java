package Arrays;

//01-02-2023
//Sort an array of 0s, 1s and 2s
public class Sort_arrays {
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0};
        int n = arr.length;

        int num0 = 0;
        int num1 = 0;
        int num2 = 0;

        for(int i=0; i<n;i++){
            if(arr[i]==0){
                num0++;
            } else if (arr[i] == 1) {
                num1++;
            }else {
                num2++;
            }
        }
        int k=0;
        for(int i=0; i<num0; i++){
            arr[k] = 0;
            k++;
        }
        for(int i=0; i<num1; i++){
            arr[k] = 1;
            k++;
        }
        for(int i=0; i<num2; i++){
            arr[k] = 2;
            k++;
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
