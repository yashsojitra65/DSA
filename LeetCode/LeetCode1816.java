package LeetCode;

//08-02-2023
//1816. Truncate Sentence.
public class LeetCode1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int n = s.length();
        int k = 4;
        String arr[] = s.split(" ");

        for(int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
//    String arr[] = s.split(" ");
//    String s1 = "";
//        for(int i=0; i<k; i++){
//        if (i == 0) {
//        s1 += arr[i];
//        }else{
//        s1 += " " + arr[i];
//        }
//        }
//        return s1;
