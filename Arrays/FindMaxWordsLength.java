package Arrays;
//27-10-2023
public class FindMaxWordsLength {
    public static void main(String[] args) {
        String s = "How are your";
        int max = 0;
        int idx = -1;
        String[] arr = s.split(" ");

        for(int i=0; i< arr.length; i++){
            if(max < arr[i].length()){
                max = arr[i].length();
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(arr[idx]);
    }
}
