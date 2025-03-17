package Arrays;

import java.util.Arrays;

public class Max_Consecutive_Ones {
    static int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        int temp2=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==1) temp++;
            if(temp2<temp) temp2=temp;
            if(nums[i]==0){

                temp=0;
            }

        }
        return temp2;
    }

    public static void main(String[] args) {

        int[] arr={1,0,1,1,0,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
