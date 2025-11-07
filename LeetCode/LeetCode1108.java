package LeetCode;

public class LeetCode1108 {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        String s1 = "";
        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '.'){
                s1 +=  String.valueOf("[.]");
            }else{
                s1 += String.valueOf(s.charAt(i));
            }
        }
        System.out.println(s1);

//        s1 += s.replace(".","[.]");
//        System.out.println(s1);
    }
}
