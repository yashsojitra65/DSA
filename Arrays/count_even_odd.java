package Arrays;
//25-01-2023
//Count even-odd in array
public class count_even_odd {
    public static void main(String[] args) {
        int arr[] = {1,6,8,3,4,2,5};
        int OddCount = 0;
        int EvenCount = 0;

        for(int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                EvenCount++;
            }else{
                OddCount++;
            }
        }
        System.out.println(OddCount);
        System.out.println(EvenCount);
    }
}
