package Arrays;
//Check Armstrong Number.
public class Armstrong_Number {
    public static void main(String[] args) {
        int n = 371;
        int sum = 0;

        while (n != 0){
            int num = n % 10;
//            sum += num * num * num;
            sum += Math.pow(num,3);
            n /= 10;
        }
        System.out.println(sum);
    }
}
