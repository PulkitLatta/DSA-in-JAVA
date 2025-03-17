package Arrays;

import java.util.Arrays;

public class Rotate_Array {
    static void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            arr[(i+k)%nums.length]=nums[i];
        }
        for(int i=0; i<arr.length; i++) {
            nums[i]=arr[i];
        }
    }
    static   void rotate(int[] arr,int left,int right){
        int start=left;
        int end= right;
        while(start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate2(int[] nums, int k) {
        int j=k%nums.length;
        if(j==0) return;
        rotate(nums,0,nums.length-1);
        rotate(nums,0,j-1);
        rotate(nums,j,nums.length-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] brr={1,2,3,4,5};
        rotate(arr,2);
        rotate2(brr,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
