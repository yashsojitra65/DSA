package Math;
//17-10-2023
//476.Number Complement.
public class LeetCode476 {
    public static void main(String[] args) {
        int num = 5;
        String s = Integer.toBinaryString(num);
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            if(arr[i] - '0' == 1){
                sb.append(0);
            } else if (arr[i] - '0' == 0) {
                sb.append(1);
            }
        }
        int ans = Integer.parseInt(sb.toString(),2);
        System.out.println(ans);
//        int nk = ~num & Integer.highestOneBit(num) - 1;
//        System.out.println(nk);
    }
}
