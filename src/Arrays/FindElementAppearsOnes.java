package Arrays;


import java.util.HashMap;
import java.util.Map;

//Find the element that appears once in an array where every other element appears twice
public class FindElementAppearsOnes {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(BruteForceApproach(arr));
        System.out.println(BetterApproach(arr));
        System.out.println(BetterApproach2(arr));
        System.out.println(OptimalAppraoch(arr));
    }

    public static int BruteForceApproach(int arr[]) {
        //TC -> O(N^2)
        //SC -> O(1)
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == 1)
                return arr[i];

        }
        return -1;
    }

    public static int BetterApproach(int arr[]){
        /*
        * Note: - Now, using array hashing it is difficult to hash the elements of the array
        * if it contains negative numbers or a very large number. So to avoid these problems,
        * we will be using the map data structure to hash the array elements.
        * */

        //TC -> O(3N)
        //SC -> O(MaxElement + 1)
        int max = arr[0];
        for(int i = 0 ; i< arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        int hash [] = new int[max+1];
        for(int i = 0 ; i< arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i = 0 ; i< hash.length;i++){
            if(hash[i] == 1){
                return arr[i];
            }
        }
        return -1;
    }

    public static int BetterApproach2(int arr[]){
        /*
        * TC -> In Java, HashMap generally takes O(1) time complexity for insertion and search. In that case,
        *       the time complexity will be O(N) + O(M)
        * SC -> O(M) as we are using a map data structure. Here M = size of the map i.e. M = (N/2)+1.
        * */
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int OptimalAppraoch(int arr[]){
        //TC -> O(N)
        //SC -> O(1)
        int xor =0;
        for(int i = 0 ; i< arr.length; i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}
