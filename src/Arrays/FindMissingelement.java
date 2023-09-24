package Arrays;

public class FindMissingelement {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 4, 3};
        int N = 4;
        System.out.println(BruteForce(arr));
        System.out.println(BerrerApproach(arr));
        System.out.println(OptimalApproach(arr,N));
        //System.out.println(OptimalApproach2(arr,N));
    }

    public static int BruteForce(int arr[]) {
        //TC -> O(N^2)

        for (int i = 0; i <= arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }

            }
            if (!flag)
                return i;
        }
        return -1;
    }

    public static int BerrerApproach(int[] arr) {
        //TC -> O(2N)
        //SC-> O(N)
        int hash[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int OptimalApproach(int arr[], int N) {
        //sum of n natural numbers(  (N*(N+1))/2  )
        int sum = (N * (N + 1)) / 2;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            s2 += arr[i];
        }
        int missingnumber = sum - s2;
        return missingnumber;
    }


    //Understand once again Striver or TakeuFroward
  /* public static int OptimalApproach2(int arr[], int n){
        int xor1 = 0;
        int xor2 = 0;
        for(int i =0; i<n; i++){
            xor2 = xor2^arr[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1^n;
        return xor1^xor2;
    }*/
}
