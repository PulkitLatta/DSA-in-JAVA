package Arrays;

public class Majority_Element {
    static int majorityElement(int[] nums) {
        int candiate=0;
        int count =0;
        for(int num: nums) {
            if(count ==0) {
                candiate=num;
            }
            count +=(candiate==num)? 1: -1;
        }
        return candiate;
    }
}
