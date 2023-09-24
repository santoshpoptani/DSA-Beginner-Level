package Arrays;

import java.util.HashMap;
import java.util.Map;

//Longest Subarray with given Sum K (Positives)
public class FindTheLongesSubArrayWithSumK {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        System.out.println(BruteForceapproach(a, 10));
        System.out.println(betterApproach(a, 10));
        System.out.println(optimalApproach(a, 10));
    }

    public static int BruteForceapproach(int arr[], int k) {
        //TC - > O(N^2)
        //SC -> O(1)
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }


        }
        return len;
    }


    /*
     *
     * This Solution is for arrays conataing positives and negatives
     *
     * */
    public static int betterApproach(int arr[], int k) {
        // TC-> O(N)
        //SC -> O(1)
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            /*
             * By calculating preSum = sum - k, we're essentially trying to find a previous cumulative sum that,
             * if subtracted from the current cumulative sum, would give us k.
             * This is because sum - preSum = k
             *
             * Suppose at a certain point in the array, we have a cumulative sum.
             * Now, if we want to find a subarray with a target sum k, it means the difference between
             * our current sum and some previous cumulative sum should be equal to k.
             *
             * Mathematically, this can be represented as sum - preSum = k.
             *
             * If this condition holds true, it implies that there exists a subarray in between
             * the current index and the index associated with the preSum whose elements sum up to k.
             *
             * Detail Exlanatin in Notions
             *
             * */
            int preSum = sum - k;
            if (map.containsKey(preSum)) {
                maxLen = Math.max(maxLen, i - map.get(preSum));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }


    //This approach is when array contains positive and zeros
    public static int optimalApproach(int arr[], int k) {
        //TC -> O(2N)
        //SC - > O(N)
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;

        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum = sum + arr[right];
            }
        }

        return maxLen;
    }
}
