package LeetCode;

//08-02-2023
//2418. Sort the People.
public class LeetCode2418 {
    public static void main(String[] args) {
        String[] s = {"Mary","John","Emma"};
        int[] arr = {180,165,170};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    String c = s[j];
                    s[j] = s[j+1];
                    s[j+1] = c;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(s[i] + " " + arr[i]);
        }
    }
}

