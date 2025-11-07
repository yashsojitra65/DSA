package Arrays;
//6.Print nth element from last
public class Print_nth_element_from_last {
    public static void main(String[] args) {
        int[] arr = {2,5,8,6,1,6,2};
        int n = arr.length;
        int m = 3;
        System.out.println(arr[n - m]);
    }
}
