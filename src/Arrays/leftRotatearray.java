package Arrays;

public class leftRotatearray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,1,4};
        optimalApproach(arr);
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
    public static void optimalApproach(int arr[]){
        int temp = arr[0];
        for(int i = 1 ; i< arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;


    }
}
