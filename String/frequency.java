package String;

public class frequency {
    public static void main(String[] args){
        String s = "11223";
        int[] arr = new int[s.length()];
        char c[] = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            arr[i] = 1;
            for (int j=i+1; j<s.length(); j++){
                if(c[i] == c[j]){
                    arr[i]++;
                    c[j] = 'O';
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(c[i] != ' ' && c[i] != 'O'){
                System.out.println(c[i] + "-" + arr[i]);
            }
        }
    }
}

//public class frequency {
//    public static void main(String[] args) {
//        String s = "Yash";
//        int arr[] = new int[128];
//
//        for (int i = 0; i < s.length(); i++) {
//            int ascii = (int) s.charAt(i);
//            arr[ascii] = arr[ascii] + 1;
//        }
//        for (char i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                System.out.println(i + "-" + arr[i]);
//            }
//        }
//    }
//}
