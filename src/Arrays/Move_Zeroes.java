package Arrays;

public class Move_Zeroes {
    static void moveZeroes(int[] nums) {
        int i=0;
        int k=1;
        while(k<nums.length){
            if(nums[i]!=0)i++;
            if(nums[i]==0 && nums[k]!=0) {
                nums[i]=nums[k];
                nums[k]=0;

            }
            k++;
        }

    }

    static void moveZeroes2(int[] nums) {
        int i = 0;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                i++;
            }
        }
    }

}
