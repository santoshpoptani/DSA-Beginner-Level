package Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int arr[] ={1,0,0,4,10,0,1,0,4};
        int x []=BruteForce(arr);
        for(int a : x){
            System.out.print(a +" ");
        }
        System.out.println();
        optimalApproach(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static int[] BruteForce(int arr[]){
        int temp [] = new int[arr.length];

        int index= arr.length-1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]!=0){
                temp[index--] = arr[i];
            }
        }
        return temp;
    }

    public static int [] optimalApproach(int arr[]){
        int j =-1;
        // this will always point to zero in array;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        if(j == -1)
            return arr;

        // this will swap the zero to the end of the list
        for(int i = j-1; i>=0; i--){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;           }
        }
        return arr;
    }
}
