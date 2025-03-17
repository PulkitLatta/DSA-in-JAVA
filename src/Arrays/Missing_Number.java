package Arrays;

public class Missing_Number {
    public int missingNumber(int[] nums) {
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            x^=i;
            x ^= nums[i];
        }


        return x^nums.length;

    }

        static int missingNumber2(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;

            for (int num : nums) {
                actualSum += num;
            }

            return expectedSum - actualSum;
        }
    }


