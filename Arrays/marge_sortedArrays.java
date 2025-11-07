package Arrays;
//Merge two sorted array
public class marge_sortedArrays {
    public static void main(String[] args){
        int arr1[] = {2,3,5,7,9,11,12};
        int arr2[] = {1,4,5,6,8,10};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int arr3[] = new int[n1 + n2];

        int i = 0;
        int j =0;
        int k = 0;

        while (i<n1 && j<n2){
            if(arr2[j] < arr1[i]){
                arr3[k]=arr2[j];
                k++;
                j++;
            } else if (arr2[j]>arr1[i]) {
                arr3[k]=arr1[i];
                k++;
                i++;
            } else if (arr2[j] == arr1[i]) {
                arr3[k]=arr2[j];
                k++;
                j++;
            }

        }
        while (i<n1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while (j<n2){
            arr3[k] = arr2[j];
            k++;
            j++;
        }
        for(int p=0;p<arr3.length;p++){
            System.out.print(arr3[p] + " ");
        }
    }
}
