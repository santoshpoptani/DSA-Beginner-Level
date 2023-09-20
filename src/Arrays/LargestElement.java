package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {4,7,1,9,2,1,9};
        // TC is nlogn
        //BruteForceApproach(arr, 0, arr.length-1);

        // TC is O(n)
        System.out.println(optimalApproach(arr));

        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Largest Element of array is " + arr[arr.length-1]);
    }

    public static void BruteForceApproach(int arr[], int low, int high){
        if(low<high){
            int piviot = partation( arr, low , high);
            BruteForceApproach(arr, low, piviot-1);
            BruteForceApproach(arr, piviot+1, high);
        }
    }

    private static int partation(int[] arr, int low, int high) {
        int piviot = arr[low];
       int i = low;
       int j = high;

       while(i<j){
           while(arr[i]<=piviot && i<= high-1){
               i++;
           }
           while(arr[j]>piviot && j>=low+1){
               j--;
           }
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

    public static int optimalApproach(int arr[]){
        int largest = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
