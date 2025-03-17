package Arrays;

import java.util.HashMap;

public class Two_Sum {
    static int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer > map = new HashMap<>();
        int[] arr = new int[2];

        for(int i=0; i<nums.length; i++){
            int wantMore= target-nums[i];
            if(map.containsKey(wantMore)) {
                arr[1]=i;
                arr[0]=map.get(wantMore);
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }


    public static void main(String[] args) {


    }
}
