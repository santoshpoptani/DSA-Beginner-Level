package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 4};
        bubbleSort(arr);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        /*
        *
        * TC of this algo is O(n^2) for average and worst case
        * for best case scenerio we can optimize code by implemeting check if
        * array is sorted and that reduces the TC to O(N)
        *
        * */
        for(int i = arr.length-1;i>=0;i--){
            boolean swapped = false;
            for(int j = 0 ; j<=i-1; j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
