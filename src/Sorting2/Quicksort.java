package Sorting2;

public class Quicksort {
    public static void main(String[] args) {
        int arr[] = {6,2,1,9,12,3};
        quickSort(arr,0,arr.length-1);
        for(Integer i  : arr){
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int arr[],int low , int high){
        if(low<high){
            int pIndex = partation(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }

    private static int partation(int[] arr, int low, int high) {
        int piviot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            // this while loop find elements greater than piviot
            while(arr[i]<=piviot && i<=high-1){
                i++;
            }
            //this while loop finds the element less than piviot
            while(arr[j]>piviot && j>=low+1){
                j--;
            }

            // this will swap the elements
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

}
