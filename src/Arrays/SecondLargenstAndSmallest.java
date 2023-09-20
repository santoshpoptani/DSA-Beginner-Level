package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargenstAndSmallest {
    public static void main(String[] args) {
        int arr[] = {1,3,9,9,8,8,7};
     // 1.
        //TC O(NlogN)
        BrutforceApproch(arr, 0 , arr.length-1);
        for(int i = arr.length-2 ; i>0; i--){
            if(arr[i]!= arr[arr.length-1]){
                System.out.println("Second Largest: " +arr[i]);
                break;
            }
        }

        //2.
        //TC O(2N)
        System.out.println("Better Approach "+Arrays.toString(betterApproach(arr)));

        //3.
        //TC O(N)
        System.out.println("Optimal Approach"+Arrays.toString(optimalApproach(arr)));

        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    public static void BrutforceApproch(int arr[], int low , int high){
        if(low>=high){
            return;
        }
        int mid  = (low+high)/2;
        BrutforceApproch(arr, low , mid);
        BrutforceApproch(arr, mid+1 , high);
        merge(arr, low, high, mid);

    }
    public static void merge(int arr[], int low , int high, int mid){
        List<Integer> list = new ArrayList<>() ;
        int left = low;
        int right = mid +1;

        while(left<=mid && right<= high){
            if(arr[left]<= arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                right++;
            }
        }

        while(left<= mid){
            list.add(arr[left]);
            left++;
        }
        while (right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++){
            arr[i] = list.get(i - low);
        }
    }

    public static int[] betterApproach(int[] arr){
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        int secondlarge = Integer.MIN_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for(int i : arr){
            if(i>largest)
                largest = i;

            if(i<Smallest)
                Smallest = i;
        }

        for(int i : arr){
            if (i>secondlarge && i!= largest)
                secondlarge = i;

            if(i<secondsmall && i!=Smallest)
                secondsmall = i;
        }
        int array[] = {secondlarge, secondsmall};
        return array;

    }

public static int[] optimalApproach(int arr[]){
        int secondLargest = SecondLargest(arr);
        int secondSmallest = SecondSmallest(arr);
        int array[] = {secondLargest, secondSmallest};
        return array;
}

    private static int SecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i: arr){
            if(i<smallest){
                secondSmallest = smallest;
                smallest = i;

            }
            else if(i<secondSmallest && i!=smallest){
                secondSmallest = i;
            }
        }
        return secondSmallest;
    }

    private static int SecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i:arr)
        {
        if(i>largest){
            secondLargest = largest;
            largest = i;
        } else if (i>secondLargest && i!=largest) {
            secondLargest = i;

        }
        }
        return secondLargest;
    }
}
