public class Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reversearrayrecursionsol2(arr,0);
    }

    public static void reverseArraysol1(int arr[]){
        int n[] = new int[arr.length];
        int j =0;
        for(int i = arr.length-1; i>=0; i--){
            n[j++] = arr[i];
        }
        for(int i = 0 ; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void reversearraysol2(int arr[]){
        for(int i =0, j =arr.length-1; i< arr.length/2;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
        }
        for(int i = 0 ; i<arr.length;i++){
            System.out.print
                    (arr[i] + " ");
        }
    }

    public static void reversearrayrecursionso1(int arr[],int l,int r){
        /*
        *
        * revers array using recursion with two pointers left and right
        *
        * */
        if(l>=r){
            //printing array
            for(int i = 0; i< arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            return;
        }
        int temp = arr[l];
        arr[l]= arr[r];
        arr[r]=temp;

        reversearrayrecursionso1(arr, l+1, r-1);
    }

    public static void reversearrayrecursionsol2(int arr[],int i){
        /*
        * reverse an array with one poninter using recursion
        * */

        if(i>arr.length/2){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[j]+" ");
            }
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1]= temp;
        reversearrayrecursionsol2(arr,i+1);
    }
}
