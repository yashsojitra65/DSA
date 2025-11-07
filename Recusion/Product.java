package Recusion;

public class Product {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(product(x,y));
    }
    public static int product(int x,int y){
        if(y == 0){
            return 0;
        }
        return x += product(x,y-1);
    }
}
