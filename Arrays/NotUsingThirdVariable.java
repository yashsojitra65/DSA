package Arrays;
//11-01-2023
//Not using third variable
public class NotUsingThirdVariable {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);
    }
}
