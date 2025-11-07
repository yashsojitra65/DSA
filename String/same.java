package String;

public class same {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not same");
        }
    }
}

//        for(int i=0; i<s1.length(); i++){
//            if(s1.charAt(i) != s2.charAt(i)){
//                System.out.println("String are not same");
//                return;
//            }
//        }
