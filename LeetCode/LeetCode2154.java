package LeetCode;

//13-03-2023
//2154. Keep Multiplying Found Values by Two.
public class LeetCode2154 {
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
        int original = 3;
        int count = 0;

        for(int i:arr){
            if(i == original){
                count = i;
            }
        }

        if(count == 0){
            System.out.println(original);
        }else {
            int ans = 0;
            for(int i=0; i< arr.length; i++){
                if(count == arr[i]){
                    count = arr[i];
                    i = -1;
                    count = count * 2;
                    ans = count;
                }
            }

            if(ans == count){
                System.out.println(count);
            }
        }
    }
}
