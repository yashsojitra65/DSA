package Math;
//26-08-2023
//507.Perfect Number.
public class LeetCode507 {
    public static void main(String[] args) {
        int num = 28;

        if(num <= 0){
            System.out.println(false);
            return;
        }
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        System.out.println(sum == num);
    }
}
