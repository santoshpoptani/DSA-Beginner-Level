package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,5};
        BruteForceApproach(arr);
        System.out.println();
        BetterApproach(arr);
        System.out.println();
        optimalSolution(arr);
        /*for (int i = 0; i <= k; i++) {
            System.out.print(arr[i]);
        }*/
    }

    public static void BruteForceApproach(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i]);
                }
            }
        }
    }

    public static void BetterApproach(int arr[]) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey());
            }
        }

    }

    public static void optimalSolution(int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[Math.abs(arr[i])]<0){
                System.out.print(Math.abs(arr[i])+" ");
            }
            else {
                arr[Math.abs(arr[i])] = arr[Math.abs(arr[i])]*-1;
            }
        }
    }
}
