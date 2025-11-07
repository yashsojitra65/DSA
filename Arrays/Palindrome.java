package Arrays;

//01-02-2023
//Palindrome Arrays
public class Palindrome {
    public static void main(String[] args) {
        int arr[] = {111, 222 ,333 ,444 ,555};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int ans = 0;
            int temp = arr[i];
            while (temp > 0){
                int r = temp%10;
                ans = (ans*10)+r;
                temp/=10;
            }
            if(ans != arr[i]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
