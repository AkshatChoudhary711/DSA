package org.practice.BinarySearch;

public class FloorOfElementInSorted {
    public static int findFloorOfElementInSorted(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] <= target){
                res = arr[mid];
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,9};
        System.out.println(findFloorOfElementInSorted(arr, 4));
    }
}
