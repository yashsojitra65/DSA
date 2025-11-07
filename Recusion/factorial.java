package Recusion;

//08-05-2023
//2. Calculate the factorial of a number.
public class factorial {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(fac(i));
    }
    public static int fac(int i){
        if(i == 1){
            return 1;
        }
        return i * fac(i - 1);
    }
}
