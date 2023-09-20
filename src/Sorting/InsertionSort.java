package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] =  {5, 2, 9, 3, 6,1};
        insertionSortinRecursion(arr,0);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }

    public static void insertionSort(int arr[]){
        for(int i = 0; i<=arr.length-1;i++){
            int j = i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void insertionSortinRecursion(int arr[], int i ){
        if(i>arr.length-1){
            return;
        }
        for(int j =i; j>0&&arr[j-1]>arr[j]; j-- ){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }
        insertionSortinRecursion(arr,i+1);
    }

    /*


     public static void insertionSort(int arr[]){
        for(int i = 0 ; i<arr.length; i++ ){

            for(int j = i ; j>0; j--){
               if(arr[j-1]>arr[j]){
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
               }
            }
        }
    }


     */
}
