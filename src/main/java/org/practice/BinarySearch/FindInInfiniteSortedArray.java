package org.practice.BinarySearch;

public class FindInInfiniteSortedArray {
    public static int findInInfiniteSortedArray(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while(arr[high]<target){
            low = high;
            high = high *2;
        }
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
}
