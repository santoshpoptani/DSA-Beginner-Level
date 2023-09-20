package Arrays;

public class RotateArrayRightByD {
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6, 7};
       // BruteForce(arr,3);
     /*   for(int a : arr){
            System.out.print(a+" ");
        }*/
        BetterApproach(arr, 3);
        System.out.println();
        optimalApproach(arr,3);
        for(int a : arr){
            System.out.print(a+" ");
        }

    }

    public static void BruteForce(int arr[], int k){
        k = k%arr.length;
        int temp[] = new int[k];
        for(int i = arr.length-k; i< arr.length; i++){
            temp[i-(arr.length-k)]= arr[i];
        }
        for(int i = arr.length-k-1; i>=0;i--){
            arr[i+k] = arr[i];
        }
        for(int i = 0; i<k;i++){
            arr[i] = temp[i];
        }
    }
    public static void BetterApproach(int arr[], int k){
        //TC -> O(N)
        //SC -> O(1)
        k= k% arr.length;
        for(int i = 0;i< arr.length; i++){
            if(i<k){
                System.out.print(arr[arr.length+i-k]+" ");
            }
            else {
                System.out.print(arr[i-k] + " ");
            }
        }
    }
    public static void optimalApproach(int arr[], int k){
        //TC -> O(N)
        //TC -> O(1)
        k = k%arr.length;

        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
