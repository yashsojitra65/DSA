package String;

//25-01-2023
//Check if string have equal digits and chars
public class equal_digits_chars{
    public static void main(String[] args) {
        String s = "ya2sh000";
        char[] s1 = s.toCharArray();

        int num=0;
        int chars=0;
        int i=0;

//        while (i<s.length()){
//            if(s1[i] >= 65 && s1[i] <= 128){
//                chars++;
//                i++;
//            } else {
//                num++;
//                i++;
//            }
//        }

        while (i<s.length()){
            if(s1[i] >= '0' && s1[i] <= '9'){
                num++;
                i++;
            }else {
                chars++;
                i++;
            }
        }

        if (num==chars){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

//        for(int i=0;i<s.length();i++){
//            if((s.charAt(i)=='0') || (s.charAt(i)=='1') || (s.charAt(i)=='2') || (s.charAt(i)=='3') || (s.charAt(i)=='4') || (s.charAt(i)=='5')
//                    || (s.charAt(i)=='6') || (s.charAt(i)=='7') || (s.charAt(i)=='8') || (s.charAt(i)=='9')){
//                num++;
//            }else if (s.charAt(i) != ' '){
//                chars++;
//            }
//        }
//        if(num==chars){
//            System.out.println("String have Equal Digits and Chars");
//        }
//        else {
//            System.out.println("String have Not Equal Digits and Chars");
//        }
    }
}