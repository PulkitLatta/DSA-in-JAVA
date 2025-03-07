package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    static void merge(int[] arr,int start,int end,int mid){
        ArrayList <Integer> temp = new ArrayList<>();
        int left=start;
        int right=mid+1;
        while(left<=mid && right<=end){
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=end){
            temp.add(arr[right]);
            right++;
        }
        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }

    static void sort(int[] arr,int start, int end){
        if(start>=end) return;
        int mid=start+(end-start)/2;

        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,end,mid);

    }

    public static void main(String[] args) {
        int[] arr={67,34,54,23,1,23,4,23};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
