package LeetCode;

//15-07-2023
//944. Delete Columns to Make Sorted.
public class LeetCode944 {
    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
        int count = 0;

        for(int i=0; i< strs[0].length(); i++){
            for(int j=0; j< strs.length-1; j++){
                if(strs[j+1].charAt(i) < strs[j].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
