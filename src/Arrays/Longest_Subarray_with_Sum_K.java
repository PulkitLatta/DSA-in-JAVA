package Arrays;
import java.util.HashMap;
public class Longest_Subarray_with_Sum_K {

        public static int longestSubarrayWithSumK(int[] arr, int k) {
            HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
            int maxLength = 0;
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];  // Calculate prefix sum

                // Case 1: If the sum itself equals k
                if (sum == k) {
                    maxLength = i + 1;
                }

                // Case 2: If (sum - k) exists in HashMap, update maxLength
                if (prefixSumMap.containsKey(sum - k)) {
                    maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
                }

                // Store the first occurrence of prefix sum
                if (!prefixSumMap.containsKey(sum)) {
                    prefixSumMap.put(sum, i);
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            int[] arr = {10, 5, 2, 7, 1, -10};
            int k = 15;
            System.out.println(longestSubarrayWithSumK(arr, k)); // Output: 6
        }


}
