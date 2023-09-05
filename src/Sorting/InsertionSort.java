package Sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] =  {5, 2, 9, 3, 6,1};
        insertionSort(arr);
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
}
