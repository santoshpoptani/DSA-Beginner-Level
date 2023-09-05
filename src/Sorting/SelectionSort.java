package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={5, 2, 9, 3, 6, 1};
        selectionSort(arr);
    }

    public static void selectionSort(int arr[]){
        /*
        * TC of this algo is O(n^2)
        *
        * Why the outer loop is going lenght-2 because the last element will always be sorted i.e
        * when we will reach at n-2 iteration the swapping will be done between n-2 and n-1 so there is no
        * need to iterate till n-2 thats why we are iteraring till n-2
        *
        * if we traverse lenght -1 there is no issue we can do that
        *
        * */
        for(int i = 0 ; i<=arr.length-2; i++){
            for(int j = i+1; j<= arr.length-1; j++ ){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }
}
