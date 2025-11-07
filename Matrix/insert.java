package Matrix;

//13-01-2023
//Implement insert, update, search, delete, display in sorted array0
public class insert {
    public static void main(String[] args) {
        int arr[] = {1,4,6,9,10,25,0};
        int n = arr.length;
        insert(arr,n,15);
        find(arr,n,1);
        update(arr,n,4);
        delete(arr,n,25);
    }
    private static void delete(int[] arr, int n, int value){
        for(int i=0; i<n; i++){
            if(arr[i] == value){
                int k = i;
                while(k<n-1){
                    arr[k] = arr[k+1];
                    k++;
                }
            }
        }
        n--;
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    private static void update(int[] arr, int n, int value){
        for(int i=0; i<n; i++){
            if(arr[i] == value){
                int k = i;
                while(k<n-1){
                    arr[k] = arr[k+1];
                    k++;
                }
                arr[k]=0;
                insert(arr,n,2);
            }
        }
    }
    private static void find(int[] arr, int n, int value){
        for(int i=0; i<n; i++){
            if(arr[i] == value && arr[i] != 0){
                System.out.println("its Present" + "Index is:" + i);
                return;
            }
        }
        System.out.println("Not Present");
    }
    private static void insert(int arr[], int n, int value){
        int k = n-1;
        int itsPos = 0;
        for(int i=0; i<n; i++){
            if(arr[k] == 0){
                k--;
            } else if (value < arr[k]) {
                k--;
            }else if (value > arr[k]){
                k++;
                itsPos = k;
            }
        }
        k = n-1;
        while (n > itsPos){
            arr[k] = arr[k-1];
            k--;
            n--;
        }
        arr[itsPos] = value;  
    }
}