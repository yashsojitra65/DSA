package Math;

public class Odd_Even {
    public static void main(String[] args) {
        int n = 6;
        int bitMash = 1;

        if((n & bitMash) == 0){
            System.out.print("Number is even");
        }else {
            System.out.print("Number is odd");
        }
    }
}
