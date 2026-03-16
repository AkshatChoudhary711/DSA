package org.practice.BinarySearch;

public class FirstOccurenceInInfiniteSortedArray {
    public static int findFirstOccurenceInInfiniteSortedArray(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while(arr[high] < target){
            low = high;
            high= high*2;
        }
        int res =-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                res = mid;
                high = mid-1;
            }else if(arr[mid] < target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return res;
    }
}
