package Sorting;

import java.util.Arrays;

public class QuickSorting {
    private static int partition(int[] arr, int start, int end ){
        int left= start+1;
        int  right = end;
        int pivot=arr[start];
        while(left<=right){

            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] > pivot) right--;

            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        int temp=arr[start];
        arr[start]=arr[right];
        arr[right]=temp;
        return right;
    }
    static void quickSort(int[] arr, int start, int end){
        if(start>=end) return;
        int pvet=partition(arr, start,end);
        quickSort(arr,start,pvet-1);
        quickSort(arr,pvet+1,end);
    }

    public static void main(String[] args) {
        int[] arr={9,7,6,5,4,87,43,2,34};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
