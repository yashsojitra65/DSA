package Arrays;
//31-01-2023
//Count pairs with given sum
public class Count_Pairs {
    public static void main(String[] args) {
        int arr[] =  {1, 5, 7, -1, 5};
        int n = arr.length;
        int sum = 6;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }
        }
        System.out.println("Count of pairs is: " + count);
    }
}
