package Arrays;

public class RotateArrayByD {
    public static void main(String[] args) {
        int arr[] = {3, 7, 8, 9, 10, 11};
       // bruteForce(arr, 3);

        System.out.println();
        betterApproach(arr,3);
        System.out.println();
        optimalApproach(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void bruteForce(int arr[], int k) {
        int d = k % arr.length;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp[i - (arr.length - d)];
        }

    }
    public static void betterApproach(int arr[], int k ){
        //TC -> O(N)
        //SC -> O(1)
        k  = k%arr.length;
        for(int i = 0 ; i<arr.length; i++){
            if(i<k){
                System.out.print(arr[arr.length-k+i]+" ");
            }
            else{
                System.out.print(arr[i-k] +" ");
            }

        }
    }

    public static void optimalApproach(int arr[], int k){
        k = k%arr.length;

        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
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
