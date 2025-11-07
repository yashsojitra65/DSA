package LeetCode;

//14-03-2023
//2057. Smallest Index With Equal Value.
public class LeetCode2057 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};

        for(int i=0; i< arr.length;i++){
            if(i%10 == arr[i]){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
