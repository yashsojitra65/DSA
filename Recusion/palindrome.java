package Recusion;

public class palindrome {
    public static void main(String[] args) {
//       String s = "nitin";
        int x = 1221;
        String s = String.valueOf(x);
        System.out.println(checkpalindronme(0,s.length()-1,s));
    }
    public static boolean checkpalindronme(int i,int j,String s){
        if(i >= j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return checkpalindronme(i+1,j-1,s);
    }
}
