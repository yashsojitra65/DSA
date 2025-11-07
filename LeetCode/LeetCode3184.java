package LeetCode;
//04-11-2025
//3184. Count Pairs That Form a Complete Day I.
public class LeetCode3184 {
    public static void main(String[] args) {
        int[] arr = {72,48,24,3};
        int count = 0;

        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if((arr[i] + arr[j]) % 24 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
