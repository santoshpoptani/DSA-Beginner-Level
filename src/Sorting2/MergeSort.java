package Sorting2;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3, 3, 3 ,6 };
        mergeSort(arr,0,arr.length-1);
        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int arr[],int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,high,mid);
    }
    public static void merge(int arr[],int low, int high,int mid){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left] );
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            list.add(arr[left]);
            left++;
        }
        while (right<=high){
            list.add(arr[right]);
            right++;
        }

       /* for(int i= low; i<=high;i++ ){
            arr[i] = list.get(i-low);
        }*/
        for (int i = 0; i < list.size(); i++) {
            arr[low + i] = list.get(i);
        }
    }

}
