package Arrays;
//Print odd elements first then even elements from array.
public class odd_elements_first_then_even {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        for(int i : arr){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        for (int i : arr){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
