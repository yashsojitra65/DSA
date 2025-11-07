package Math;

//24-02-2023
//2427. Number of Common Factors..
public class LeetCode2427 {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int ans = 0;
        int[] arr = new int[b];

        for(int i=1; i<=arr.length; i++){
            if(a%i == 0 && b%i == 0){
                ans++;
            }
        }

        System.out.print(ans);
    }
}
