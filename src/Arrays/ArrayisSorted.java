package Arrays;

public class ArrayisSorted {
    public static void main(String[] args) {
        int arr[] ={1,2,3,6,7,8};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<arr[i+1])
                continue;
            else
                return false;
        }

        return true;
    }
}
