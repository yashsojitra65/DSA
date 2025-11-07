package LeetCode;

//04-02-2023
//1313. Decompress Run-Length Encoded List
public class LeetCode1313 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(i%2==0){
                count = count + arr[i];
            }
        }
        int ans[] = new int[count];
        int freq = 0;
        int value = 0;
        int k = 0;
        int g = 0;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                freq = arr[i];
                value = arr[i + 1];
                for(int j=0; j<freq; j++){
                    ans[g] = value;
                    g++;
                }
            }
        }

        for(int i=0; i< ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
