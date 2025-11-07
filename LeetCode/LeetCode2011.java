package LeetCode;

//02-03-2023
//2011. Final Value of Variable After Performing Operations
public class LeetCode2011 {
    public static void main(String[] args) {
        String[] s =  {"+-X","++X","X-+"};
        int n = s.length;
        String[] s1 = new String[n];

        int j = 0;
        for(int i=0; i<n; i++){
            if(s[i].charAt(1) == '+'){
                j++;
            }else {
                j--;
            }
        }
        System.out.println(j);
    }
}
